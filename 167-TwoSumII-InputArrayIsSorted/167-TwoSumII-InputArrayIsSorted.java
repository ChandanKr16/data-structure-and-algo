// Last updated: 8/16/2025, 8:51:01 PM
class Solution {
    public int[] twoSum(int[] num, int target) {
        int left = 0;
        int right = num.length-1;

        while(left < right){
            int sum = num[left] + num[right];

            if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }else{
                return new int[]{left+1, right+1};
            }

        }



        return new int[]{};
    }
}