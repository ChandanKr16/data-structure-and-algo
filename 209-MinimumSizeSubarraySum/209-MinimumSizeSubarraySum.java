// Last updated: 7/23/2025, 10:54:17 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int length = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int currentLen = 0;
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            while(sum >= target){
                currentLen = i - start + 1;
                
                sum -= nums[start++];
                length = Math.min(length, currentLen);
            }

            
        }



        return length == Integer.MAX_VALUE ? 0 : length;
    }
}