// Last updated: 8/10/2025, 10:08:14 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double currentSum = 0;
        int start = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];

            if(i >= k-1){
                double currentAvg = currentSum / k;
                maxAvg = Math.max(maxAvg, currentAvg);

                currentSum -= nums[start++];
            }
        }

        return maxAvg;
    }
}