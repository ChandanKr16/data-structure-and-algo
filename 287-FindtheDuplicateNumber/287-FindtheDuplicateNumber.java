// Last updated: 9/5/2025, 8:25:52 PM
class Solution {
    public int findDuplicate(int[] nums) {

      //  if(nums.length == 1) return nums[0];

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) return nums[i];
        }

        return nums[0];
    }
}