// Last updated: 9/17/2025, 9:16:36 AM
class Solution {

    public int[] dailyTemperatures(int[] temp) {
        
        int result[] = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for(int i = 0; i < temp.length; i++){

            while(!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int idx = stack.pop();
                result[idx] = i-idx;
            }

            stack.push(i);

        }    

        return result;
    }

}