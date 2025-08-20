// Last updated: 8/20/2025, 6:55:36 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int minLen = Integer.MAX_VALUE;
       int sum = 0;
       int start = 0;
       int end = 0;

       while(end < nums.length){

            sum += nums[end];
            
            while(start < nums.length && sum >= target){
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start++];
            }
            end++;

       }

       return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}