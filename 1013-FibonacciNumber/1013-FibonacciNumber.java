// Last updated: 7/23/2025, 10:53:43 PM
class Solution {
    public int fib(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        int a = 0;
        int b = 1;
        int c = 0;

        int counter = 1;

        
        
        
        while(counter < n){
            c = a + b; 
            a = b;
            b = c;                      
            counter++;
        }

        return c;
    }
}