// Last updated: 7/23/2025, 10:54:06 PM
class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start < end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }

        //return s;
    }
}