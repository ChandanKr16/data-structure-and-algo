// Last updated: 9/4/2025, 8:22:02 PM
class Solution {

    public int minOperations(int[] nums, int x) {
        
        int result = -1;

        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        int find = sum - x;

        int start = 0;
        int end = 0;

        int subSum = 0;

        int len = Integer.MIN_VALUE;

        if(sum < x) return -1;

        while(end < nums.length && start < nums.length){

            
            subSum += nums[end];

            while(start < nums.length && subSum >= find){
                if(subSum == find)
                    len = Math.max(len, end - start + 1);
                subSum -= nums[start++];
            }

            end++;

        }

        if(find == 0 && len == Integer.MIN_VALUE) return 1;

        return len == Integer.MIN_VALUE ? -1 : nums.length - len;
    }
}