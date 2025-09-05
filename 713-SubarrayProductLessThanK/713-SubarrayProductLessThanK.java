// Last updated: 9/5/2025, 12:24:13 PM
class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 0) return 0;

        int count = 0;  
        int start = 0;
        int end = 0;
        long product = 1;

        while(end < nums.length){

            product *= nums[end];

            

            while(start <= end && product >= k){
                product = product / nums[start++];
                
            }

            count += (end - start) + 1;

            end++;

        }

        return count;

    }
}