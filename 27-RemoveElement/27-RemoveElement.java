// Last updated: 7/23/2025, 10:54:40 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int i = 0;
        int count = 0;
        while(start < nums.length){

            if(nums[start] != val){
                int temp = nums[start];
                nums[start] = nums[i];
                nums[i] = temp;
                i++;
           
                count++;
            }
        start++;

        }

        return count;
    }
}