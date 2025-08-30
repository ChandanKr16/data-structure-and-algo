// Last updated: 8/30/2025, 8:27:43 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] % 2 == 0 ? 0 : 1;
        }

        while(end < nums.length){
            sum += nums[end];

            if(sum == k){
                result++;
            }

            if( map.containsKey(sum - k)){
                result += map.get(sum-k);
            }
            
            map.put(sum,  map.getOrDefault(sum, 0)+1);
       
            end++;
        }

        return result;
        
    }
}