// Last updated: 7/23/2025, 10:54:08 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int i = 0;

        while(start < nums.length){

            if(nums[start] != 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                i++;
            }
            start++;

        }
    }
}