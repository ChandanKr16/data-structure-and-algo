// Last updated: 8/22/2025, 4:01:54 PM
class Solution {


       private int slidingWindowAtMost(int[] nums, int goal) {
        int start = 0, currentSum = 0, totalCount = 0;

        // Iterate through the array using a sliding window approach
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end];

            // Adjust the window by moving the start pointer to the right
            // until the sum becomes less than or equal to the goal
            while (start <= end && currentSum > goal) {
                currentSum -= nums[start++];
            }

            // Update the total count by adding the length of the current subarray
            totalCount += end - start + 1;
        }
        return totalCount;
    }

    public int subarraySum(int[] nums, int goal) {
        // int sum = 0;
        // int count = 0;
        // int left = 0, right = 0;

        // while(right < nums.length){
        //     sum += nums[right];
            
        //     if(sum == k){
        //         count += right - left + 1;
        //     }

        //     while(sum > k && left <= right){
        //         sum -= nums[left++];
        //     }

            
        //     right++;

        // }

        // return count;

          int totalCount = 0;
        int currentSum = 0;
        // {prefix: number of occurrence}
        Map<Integer, Integer> freq = new HashMap<>(); // To store the frequency of prefix sums

        for (int num : nums) {
            currentSum += num;
            if (currentSum == goal){
                totalCount++;
            }

            // Check if there is any prefix sum that can be subtracted from the current sum to get the desired goal
            if (freq.containsKey(currentSum - goal)){
                totalCount += freq.get(currentSum - goal);
            }

            freq.put(currentSum, freq.getOrDefault(currentSum, 0) + 1);
        }

        return totalCount;



       // return slidingWindowAtMost(nums, k) - slidingWindowAtMost(nums, k-1);
    }
}