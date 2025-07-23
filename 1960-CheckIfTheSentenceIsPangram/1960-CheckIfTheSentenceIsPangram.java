// Last updated: 7/23/2025, 10:53:26 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean alphabets[] = new boolean[26];
        int count = 0;

        for(char c : sentence.toCharArray()){
            int idx = c - 'a';
            if(alphabets[idx] == false){
                count++;
                alphabets[idx] = true;
            }

        }

        return count == 26 ? true : false;
    }
}