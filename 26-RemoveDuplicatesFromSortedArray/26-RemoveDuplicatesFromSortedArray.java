// Last updated: 7/23/2025, 10:54:42 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        int start = 1;
        int count = 1;
        while(start < nums.length){

            if(nums[start] != nums[idx]){
                nums[++idx] = nums[start];
                 count++;
                
            }
            start++;
           

        }

        return count;
    }
}