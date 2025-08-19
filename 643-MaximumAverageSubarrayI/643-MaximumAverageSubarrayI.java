// Last updated: 8/19/2025, 8:22:44 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage =  Integer.MIN_VALUE;
        double sum = 0;
        int start = 0;

        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            if(i >= k-1){
                
                double avg = sum / k;
                maxAverage = Math.max(avg, maxAverage);
                sum = sum - nums[start++];

            }
        }

        return maxAverage;
    }
}