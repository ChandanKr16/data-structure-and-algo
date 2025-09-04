// Last updated: 9/4/2025, 7:48:25 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0, start = 0, end = 0, n = nums.length;
        int oneCount = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while(end < n){

            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);

            if(nums[end] == 1) oneCount++;

            
            while(start < n && end - start - oneCount + 1 > k){
                int startNum = nums[start++];
                if(startNum == 1) 
                    oneCount--;
            }

            maxLen = Math.max(maxLen, end - start + 1);

            end++;

        }


        return maxLen;
    }
}