// Last updated: 8/16/2025, 9:29:17 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closestSum = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){

            int left = i+1;
            int right = nums.length-1;

            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target) return target;
                else if(sum > target){

                    if(Math.abs(target - sum) < closestSum){
                        closestSum = Math.abs(target - sum);
                        result = sum;
                    }

                    right--;
                }
                else {
                     if(Math.abs(target - sum) < closestSum){
                        closestSum = Math.abs(target - sum);
                        result = sum;
                    }
                    left++;
                }

            }

            

        }


        return result;

    }
}