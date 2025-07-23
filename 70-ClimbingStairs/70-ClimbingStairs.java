// Last updated: 7/23/2025, 10:54:32 PM
class Solution {
    public int climbStairs(int n) {
        
        int a = 0;
        int b = 1;
        int c = 1;

        while(n != 0){
            c = a+b;
            a = b;
            b = c;
            n--;
        }

        return c;

    }
}