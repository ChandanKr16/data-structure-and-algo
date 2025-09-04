// Last updated: 9/4/2025, 10:37:39 AM
class Solution {
    public int minOperations(int[] nums, int x) {
        int result = Integer.MAX_VALUE;

        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        suffix[nums.length-1] = nums[nums.length-1];

        for(int i = nums.length-2; i >= 0; i--){
            suffix[i] = nums[i] + suffix[i+1];
        }

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(int i = 0; i < prefix.length; i++){
            map.put(prefix[i], i);
            map2.put(suffix[i], i);
        }


        if(map.containsKey(x)) {
            result = Math.min(result, map.get(x));
            result++;
        }

        if(map2.containsKey(x)){
            result = Math.min(result, nums.length - map2.get(x));
        }

        if(x > prefix[prefix.length-1]) return -1;


        for(int i = suffix.length-1; i >= 0; i--){
            int find = x - suffix[i];

            if(map.containsKey(find)){
                result = Math.min(result, nums.length-i+map.get(find)+1);
            }

        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}