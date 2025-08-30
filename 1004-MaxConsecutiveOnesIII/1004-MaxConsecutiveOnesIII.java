// Last updated: 8/30/2025, 5:51:17 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        int max = 0;
        int zeroCount = 0;
        int oneCount = 0;

        while(end < n){

            if(nums[end] % 2 == 0){
                zeroCount++;
            }
            else{
                oneCount++;
            }

            if(end - start - oneCount + 1 <= k){
                max = Math.max(max, end - start+1);
            }

            while(end - start - oneCount + 1 > k){
                if(nums[start] == 1){
                    --oneCount;
                }
                start++;
            }

            end++;
        }

        return max;
    }
}