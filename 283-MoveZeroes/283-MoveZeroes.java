// Last updated: 8/12/2025, 8:30:54 PM
class Solution {
    public void moveZeroes(int[] nums) {

        int insertPointer = 0;
        int i = 0;

        while(i < nums.length){

            if(nums[i] != 0){
                int temp = nums[insertPointer];
                nums[insertPointer++] = nums[i];
                nums[i] = temp;                 
            }
            i++;

        }
    }
}