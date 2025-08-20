// Last updated: 8/20/2025, 6:42:09 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxAvg = Integer.MIN_VALUE;
       double sum = 0;
       int start = 0;

       for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            if(i >= k-1){
                double avg = sum / k;
                maxAvg = Math.max(maxAvg, avg);
                sum -= nums[start++];

            }        

       }


       return maxAvg;
    }
}