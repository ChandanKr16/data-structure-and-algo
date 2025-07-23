// Last updated: 7/23/2025, 10:54:22 PM
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = 1;

        while(right < numbers.length){

            int sum = numbers[left] + numbers[right];

            if(sum < target){
                left++;
                right++;
            }
            
            while(sum > target){
                left--;
                sum = numbers[left] + numbers[right];
            }

            if(sum == target){
                return new int[]{left+1, right+1};
            }

        }

        return new int[]{};
    }
}