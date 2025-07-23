// Last updated: 7/23/2025, 10:53:23 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
      
        int result[] = new int[nums.length*2];

        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i];
            result[i+nums.length] = nums[i];
        }

        return result;

    }
}