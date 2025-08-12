// Last updated: 8/12/2025, 8:04:38 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int insertPointer = 1;
        int i = 1;
        int count = 1;
        while(i < nums.length){

            if(nums[i] != nums[i-1]){
                nums[insertPointer++] = nums[i]; 
                count++;
            }
            

            i++;

        }

        return count;
    }
}