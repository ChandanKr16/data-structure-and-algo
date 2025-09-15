// Last updated: 9/15/2025, 7:28:33 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int num : nums2){

            while(!stack.isEmpty() && num > stack.peek()){
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }

        while(!stack.isEmpty()){

            nextGreater.put(stack.pop(), -1);

        }

        for(int i = 0; i < nums1.length; i++){
            result[i] = nextGreater.get(nums1[i]);
        }
                
        
        return result;
    }
}