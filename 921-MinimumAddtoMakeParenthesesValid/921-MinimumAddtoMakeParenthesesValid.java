// Last updated: 9/8/2025, 10:42:05 PM
class Solution {
    public int minAddToMakeValid(String s) {
        
        int count = 0;

        Stack<Character> stack = new Stack<>();

       
        for(char ch : s.toCharArray()){

            if(ch == '(')
                stack.push(ch);
            else if(ch == ')'){

                if(stack.isEmpty()){
                    count++;
                }
                else {
                    stack.pop();
                }

            }

        }


    

        return count + stack.size();

    }
}