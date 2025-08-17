// Last updated: 8/17/2025, 7:33:44 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int count = 1;
        int insertPointer = 1;


        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                nums[insertPointer++] = nums[i];
                count++;
            }
           // i++;

        }

        return count;


    }
}