// Last updated: 7/23/2025, 10:53:20 PM
class Solution {
    public int[] buildArray(int[] nums) {
        int result[] = new int[nums.length];

            for(int i = 0; i < nums.length; i++){
                result[i] = nums[nums[i]];
            }

        return result;
    }
}