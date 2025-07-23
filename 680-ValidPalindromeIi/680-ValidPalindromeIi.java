// Last updated: 7/23/2025, 10:53:52 PM
class Solution {
    public boolean validPalindrome(String str) {
        
        int s = 0;
        int e = str.length()-1;

        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return isPalindrome(str, s+1, e) || isPalindrome(str, s, e-1);
            }
            s++;
            e--;
        }

        return true;
        
    }

    public boolean isPalindrome(String str, int s, int e){
       

        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }

        return true;
    }



}