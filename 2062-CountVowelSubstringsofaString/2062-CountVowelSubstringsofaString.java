// Last updated: 8/31/2025, 7:23:39 AM
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
            set.add(word.charAt(i));
            for(int j = i + 1; j < word.length(); j++){
                if(!isVowel(word.charAt(j))) break;
                set.add(word.charAt(j));

                if(set.size() == 5) count++;
                
            }
        }

        return count;
    }
}