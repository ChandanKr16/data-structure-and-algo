// Last updated: 8/14/2025, 10:07:43 PM
class Solution {
    public void sortColors(int[] nums) {
       int start = 0, mid = 0, end = nums.length-1;

       while(mid <= end){

             if(nums[mid] == 0){
                nums[mid] = nums[start];
                nums[start] = 0;
                start++;
                mid++;
             }
             else if(nums[mid] == 2){
                nums[mid] = nums[end];
                nums[end] = 2;
                end--;
             }
             else{mid++;}
       }

    }
}