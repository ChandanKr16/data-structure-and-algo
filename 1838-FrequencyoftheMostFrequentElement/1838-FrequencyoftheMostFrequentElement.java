// Last updated: 9/7/2025, 8:08:07 AM
class Solution {

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int len = 0;
        int start = 0;
        int end  = 0;
        long sum = 0;

        while(end < nums.length){
            long target = nums[end];
            sum += target;

            while((target * (end - start + 1)) - sum > k){
                sum -= nums[start];
                start++;
            }

            len = Math.max(len, end - start + 1);
            end++;            

        }


        return len;        
    }
}