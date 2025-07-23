// Last updated: 7/23/2025, 10:54:10 PM
class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        char charArr1[] = s.toCharArray();
        char charArr2[] = t.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for(int i = 0; i < charArr1.length; i++){
            if(charArr1[i] != charArr2[i]) return false;
        }

        return true;

    }
}