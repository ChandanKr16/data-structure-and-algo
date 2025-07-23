// Last updated: 7/23/2025, 10:54:36 PM
class Solution {
    public List<Integer> findSubstring(String str, String[] words) {
        
        List<Integer> result = new ArrayList<>();

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
        }

        int wordLen = words[0].length();
        int totalWordLen = wordLen * words.length;

        int left = 0, right = 0;

        for(int i = 0; i < wordLen; i++){
            left = i;
            right = i;
            Map<String, Integer> seen = new HashMap<>();

            while(right+wordLen <= str.length()){
                String word = str.substring(right, right+wordLen);
                right += wordLen;
                    

                if(wordCount.containsKey(word)){
                
                    seen.put(word, seen.getOrDefault(word, 0)+1);

                    while(seen.get(word) > wordCount.get(word)){
                        String leftWord = str.substring(left, left+wordLen);
                        left += wordLen;
                        
                        seen.put(leftWord, seen.get(leftWord)-1);
                    }

                    if(right - left == totalWordLen){
                        result.add(left);
                    }
                   
                }
                else {
                     
                        seen.clear();
                    
                        left = right;
                    
                }
            
            } 
        
        }
       return result;
    }
}