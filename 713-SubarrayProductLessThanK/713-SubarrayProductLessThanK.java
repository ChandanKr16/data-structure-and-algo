// Last updated: 8/22/2025, 12:36:13 PM
class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1) return 0; 

        int count = 0;
        int left = 0;
        int right = 0;
        long product = 1;

        while(right < nums.length){
            
            product *= nums[right];

           // if(product < k){
               
            //}

            while(left <= right && product >= k){
                product /= nums[left];

                left++;
            }

             count += (right - left + 1);

            right++;

        }

        return count;
    }
}