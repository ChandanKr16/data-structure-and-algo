// Last updated: 7/23/2025, 10:53:40 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int oneCount = 0;
        int start = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 1)
                ++oneCount;

            while(i - start + 1 - oneCount > k){

                if(nums[start++] == 1){
                    oneCount--;
                }

            }

            maxLen = Math.max(maxLen, i - start+1);
        }

        return maxLen;
       
    }
}