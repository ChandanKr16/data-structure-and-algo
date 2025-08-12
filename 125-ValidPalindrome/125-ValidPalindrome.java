// Last updated: 8/12/2025, 8:19:29 PM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while(left < right){

            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);

            if(!Character.isLetterOrDigit(leftCh)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightCh)){
                right--;
            }
            else if(leftCh != rightCh){
                return false;
            }
            else{
                left++;
                right--;
            }
        }

        return true;

    }
}