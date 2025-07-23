// Last updated: 7/23/2025, 10:54:24 PM
class Solution {
    public boolean isPalindrome(String s) {

      
        int start = 0;
        int end = s.length()-1;

        while(start < end){

            char startCh = Character.toLowerCase(s.charAt(start));
            char endCh = Character.toLowerCase(s.charAt(end));

            while(start < s.length()-1 && !Character.isLetterOrDigit(startCh)){
                start++;
                startCh = Character.toLowerCase(s.charAt(start));
            }

            while(end > 0 && !Character.isLetterOrDigit(endCh)){
                end--;
                endCh = Character.toLowerCase(s.charAt(end));
            }


         if(Character.isLetterOrDigit(endCh) && Character.isLetterOrDigit(startCh) && startCh != endCh)
                return false;

            start++;
            end--;
        }

        return true;


    }
}