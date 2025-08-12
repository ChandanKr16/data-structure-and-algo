// Last updated: 8/12/2025, 7:50:49 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int sortedArr[] = new int[nums.length];

        int i = nums.length -1;
        int left = 0;
        int right = nums.length -1 ;

        while(left <= right){

            int sqLeft = nums[left] * nums[left];
            int sqRight = nums[right] * nums[right];

            if(sqLeft > sqRight){
                sortedArr[i] = sqLeft;
                left++;
            }
            else{
                sortedArr[i] = sqRight;
                right--;
            }
            i--;
        }


        return sortedArr;
    }
}