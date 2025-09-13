// Last updated: 9/13/2025, 7:07:31 PM
class Solution {
    public String minRemoveToMakeValid(String str) {
        Stack<Integer> stack = new Stack<>();
        char arr[] = str.toCharArray();


        for(int i = 0; i < arr.length; i++){

            if(arr[i] == '(')
                stack.push(i);
            else if(arr[i] == ')'){
                if(stack.isEmpty()){
                    arr[i] = ' ';
                }
                else stack.pop();
            }
        }

        while(!stack.isEmpty()){
            arr[stack.pop()] = ' ';
        }

        return new String(arr).replace(" ", "");
    }
}