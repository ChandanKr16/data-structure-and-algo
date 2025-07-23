// Last updated: 7/23/2025, 10:54:53 PM
class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) return false;

        return reverse(x) == x;        

    }

    public int reverse(int num){
        int reversedNum = 0;

        while(num != 0){
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        return reversedNum;
    }
}