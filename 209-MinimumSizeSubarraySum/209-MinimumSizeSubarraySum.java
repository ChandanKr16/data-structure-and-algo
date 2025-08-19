// Last updated: 8/19/2025, 6:05:24 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int minLen = Integer.MAX_VALUE;
        int len = 0;

        int start = 0, end = 0;
        int sum = 0;

        while(end < nums.length){

            sum += nums[end];

            while(start < nums.length && sum >= target){
                minLen = Math.min(minLen, end - start+1);

                sum -= nums[start++];

            }

            end++;
        }



        return minLen == Integer.MAX_VALUE ? 0 : minLen;        

    }
}