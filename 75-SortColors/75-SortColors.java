// Last updated: 7/23/2025, 10:54:30 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = -1, mid = -1, high = nums.length;
        int i = 0;
        while(mid+1 < high){

            if(nums[mid+1] > 1){
                int temp = nums[mid+1];
                nums[mid+1] = nums[high-1];
                nums[high-1] = temp;
                high--;
                
            }
            else if(nums[mid+1] == 1){
                mid++;
                
            }
            else {
                int temp = nums[mid+1];
                nums[mid+1] = nums[low+1];
                nums[low+1] = temp;
                mid++;
                low++;
                
            }
            i++;

        }

    }
}