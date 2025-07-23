// Last updated: 7/23/2025, 10:54:46 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

      
        int j  = 1;
        int k = nums.length - 1;

        int result = Integer.MAX_VALUE;


        for(int i = 0; i < nums.length; i++){
                j = i+1;
                k = nums.length-1;
                while(j < k){
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum > target){
                        k--;
                    }
                    else if(sum < target) {
                        j++;
                    }
                    else {
                        return sum;
                    }


                    if(Math.abs(target-sum) < Math.abs(target - result)){
                        result = sum;
                    }
                   // result = Math.min(result, Math.abs(target-sum));
                }

        }
        


        return result;

    }
}