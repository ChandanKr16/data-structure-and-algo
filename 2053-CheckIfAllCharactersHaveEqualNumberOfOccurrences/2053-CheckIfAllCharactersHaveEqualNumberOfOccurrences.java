// Last updated: 7/23/2025, 10:53:21 PM
class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int counts[] = new int[26];

        int index = -1;
        for(char ch : s.toCharArray()){
            counts[ch - 'a'] += 1 ;
            index = ch - 'a';
        }



       for(int i = 0; i < counts.length; i++){
        if(counts[i] != 0 && counts[index] != counts[i]) return false;
       }      



        return true;
    }
}