// Last updated: 8/22/2025, 6:29:46 PM
class Solution {

    public int subarraySum(int[] nums, int goal) {
        

          int totalCount = 0;
        int currentSum = 0;
        
        Map<Integer, Integer> freq = new HashMap<>(); // To store the frequency of prefix sums

        freq.put(0, 1);

        for (int num : nums) {
            currentSum += num;
            

            // Check if there is any prefix sum that can be subtracted from the current sum to get the desired goal
            if (freq.containsKey(currentSum - goal)){
                totalCount += freq.get(currentSum - goal);
            }

            freq.put(currentSum, freq.getOrDefault(currentSum, 0) + 1);
        }

        return totalCount;



    
    }
}