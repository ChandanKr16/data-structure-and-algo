// Last updated: 8/13/2025, 9:30:26 PM
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(mid <= right){
            if(nums[mid] == 0){
                nums[mid] = nums[left];
                nums[left] = 0;
                left++;
                mid++;
            }
            else if(nums[mid] == 2){
                nums[mid] = nums[right];
                nums[right] = 2;
                right--;
            }
            else{
                mid++;
            }
        }

      
    }
}