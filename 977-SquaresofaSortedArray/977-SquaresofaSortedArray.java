// Last updated: 8/13/2025, 7:45:33 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int sortedArr[] = new int[nums.length];


        int left = 0, right = nums.length-1, i = nums.length-1;

        while(left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){
                sortedArr[i--] = leftSq;
                left++;
            }
            else{
                sortedArr[i--] = rightSq;
                right--;
            }
        }
     

        return sortedArr;
    }
}