// Last updated: 9/5/2025, 12:21:59 PM
class Solution {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k <= 1) return 0; 

        int count = 0;
        int left = 0;
        int right = 0;
        long product = 1;

        while(right < nums.length){
            
            product *= nums[right];

              

         
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