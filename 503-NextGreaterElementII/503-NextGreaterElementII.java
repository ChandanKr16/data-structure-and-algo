// Last updated: 9/20/2025, 7:58:02 AM
class Solution {

    public int[] nextGreaterElements(int[] nums) {

        int result[] = new int[nums.length];
        Stack<Integer> stack  = new Stack<>();
        Arrays.fill(result, 0, nums.length, -1);
        
        for(int i = 0; i < nums.length*2; i++){

            int idx = i % nums.length;

            while(!stack.isEmpty() && nums[idx] > nums[stack.peek()]){
                result[stack.peek()] = nums[idx];
                stack.pop();
            }

            if(i < nums.length){
                stack.push(idx);
            }
            
        }
        
        return result;
    }
    
}