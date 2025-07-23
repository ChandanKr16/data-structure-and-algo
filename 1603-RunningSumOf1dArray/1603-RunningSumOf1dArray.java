// Last updated: 7/23/2025, 10:53:33 PM
class Solution {
    public int[] runningSum(int[] nums) {
        
        int runningSum[] = new int[nums.length];
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }
        
        return runningSum;
        
    }
}