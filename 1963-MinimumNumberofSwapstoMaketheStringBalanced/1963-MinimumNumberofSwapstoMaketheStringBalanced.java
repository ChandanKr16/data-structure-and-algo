// Last updated: 9/11/2025, 10:38:18 PM
class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for(char ch : s.toCharArray()){

            if(ch == '[')
                stack.push(ch);
            
            if(ch == ']'){
                if(!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else result++;
            }

        }


        return (result+1)/2;        
    }
}