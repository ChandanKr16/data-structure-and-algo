// Last updated: 8/31/2025, 7:24:56 AM
class Solution {
    
    private boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? true : false;
    }

    public int countVowelSubstrings(String word) {
        int count = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < word.length(); i++){
            if(!isVowel(word.charAt(i))) continue;
            set.clear();           
            for(int j = i; j < word.length(); j++){
                if(!isVowel(word.charAt(j))) break;
                set.add(word.charAt(j));

                if(set.size() == 5) count++;
                
            }
        }

        return count;
    }
}