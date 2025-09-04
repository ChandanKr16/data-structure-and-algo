// Last updated: 9/4/2025, 8:26:39 PM
class Solution {

    public int minOperations(int[] nums, int x) {
        
      

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int find = sum - x;

        int start = 0;
        int end = 0;

        int subSum = 0;

        int len = Integer.MIN_VALUE;

        //if(sum < x) return -1;

        while(end < nums.length){

            
            subSum += nums[end];

            while(start <= end && subSum > find){
                
                subSum -= nums[start++];
            }

            if(subSum == find)
                    len = Math.max(len, end - start + 1);

            end++;

        }

       

        return len == Integer.MIN_VALUE ? -1 : nums.length - len;
    }
}