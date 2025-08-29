// Last updated: 8/29/2025, 9:12:34 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pattern = new HashMap<>();
        Map<Character, Integer> charFreq = new HashMap<>();
        
        int end = 0;
        int start = 0;
        int n  = s.length();
        int count = 0;

        for(char ch : p.toCharArray()){
            pattern.put(ch, pattern.getOrDefault(ch, 0)+1);
        }

        while(end < n){
            
            char ch = s.charAt(end);

            charFreq.put(ch, charFreq.getOrDefault(ch, 0)+1);

            if(!pattern.containsKey(ch)){
                charFreq.clear();
                count = 0;
                start = end+1;
            }
            else if(charFreq.get(ch).intValue() == pattern.getOrDefault(ch, 0).intValue()){
                count++;
            }
            else{
                while(charFreq.get(ch).intValue() > pattern.getOrDefault(ch, 0).intValue()){
                    char startCh = s.charAt(start++);
                    charFreq.put(startCh, charFreq.get(startCh)-1);

                    if(pattern.containsKey(startCh) && charFreq.get(startCh) == 0){
                        count--;
                        charFreq.remove(startCh);
                    }
                }
            }
           

            if(charFreq.equals(pattern)){
                result.add(end-p.length()+1);
                
                char startCh = s.charAt(start++);
                
                if(pattern.containsKey(startCh)){
                    charFreq.put(startCh, charFreq.get(startCh)-1);
                    count--;
                    if(charFreq.get(startCh) == 0){
                        charFreq.remove(startCh);
                    }
                }
            }


            end++;
        }
    

        

        return result;
    }
}