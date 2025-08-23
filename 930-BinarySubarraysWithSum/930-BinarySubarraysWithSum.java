// Last updated: 8/23/2025, 8:30:44 AM
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);


        for(int num : nums){
            sum += num;

           // if(sum == goal) ++count;

            if(prefixSumCount.containsKey(sum - goal)){
                count += prefixSumCount.get(sum-goal);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0)+1);


        }

        return count;
    }
}