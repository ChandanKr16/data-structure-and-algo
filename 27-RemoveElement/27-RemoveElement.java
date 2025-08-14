// Last updated: 8/14/2025, 10:25:13 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int insertPointer = 0;
        int i = 0;
        int count = 0;

        while(i < nums.length){

            if(nums[i] != val){
                nums[insertPointer++] = nums[i];
                count++;
            }
            i++;

        }

        return count;
    }
}