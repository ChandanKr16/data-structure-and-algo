// Last updated: 7/23/2025, 10:54:56 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
           int complement = target - nums[i];

           if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
           }
           map.put(nums[i], i);
        }

        return new int[]{};
    }
}