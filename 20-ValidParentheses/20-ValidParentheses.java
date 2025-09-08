// Last updated: 9/8/2025, 9:03:34 AM
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        

        // if(s.length() % 2 != 0) 
        //     return false;

        for(char ch : s.toCharArray()){

            if(ch == '{' || ch == '(' || ch == '[')
                stack.push(ch);
            else if(ch == '}' || ch == ')' || ch == ']'){
                if(stack.isEmpty() || stack.peek() != map.get(ch)) return false;
                stack.pop();
            }          
          

        }

        return stack.isEmpty();

    }
}