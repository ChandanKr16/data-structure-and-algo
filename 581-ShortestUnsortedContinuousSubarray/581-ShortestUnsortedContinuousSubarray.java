// Last updated: 8/2/2025, 7:59:15 PM
class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int left = -1;
        int right = -2;
        int max = nums[0];
        int min = nums[nums.length-1];

        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[nums.length-1-i]);

            if(nums[i] < max){
                right = i;
            } 

            if(nums[nums.length-i-1] > min){
                left = nums.length-1-i;
            }

        }

       

        return right - left + 1;

    }
}