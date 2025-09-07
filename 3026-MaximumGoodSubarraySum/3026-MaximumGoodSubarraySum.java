// Last updated: 9/7/2025, 8:19:27 PM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long ans = Long.MIN_VALUE;  // track max sum
        long prefix = 0;            // prefix sum so far
        Map<Integer, Long> best = new HashMap<>();  // store best starting candidates

        for (int num : nums) {
            prefix += num;

            // Case 1: nums[i] = nums[j] + k
            if (best.containsKey(num + k)) {
                ans = Math.max(ans, prefix - best.get(num + k));
            }
            // Case 2: nums[i] = nums[j] - k
            if (best.containsKey(num - k)) {
                ans = Math.max(ans, prefix - best.get(num - k));
            }

            // Update best for current num
            // Store minimum (prefix - num) seen so far
            best.put(num, Math.min(best.getOrDefault(num, Long.MAX_VALUE), prefix - num));
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}