// Last updated: 9/8/2025, 10:26:07 PM
class Solution {
    public int minAddToMakeValid(String s) {
        
        int count = 0;

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if(ch == ')' || ch == ']' || ch == '}'){

                if(stack.isEmpty() || map.get(ch) != stack.peek()){
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