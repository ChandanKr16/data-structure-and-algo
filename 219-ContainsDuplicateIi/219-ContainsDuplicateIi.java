// Last updated: 7/23/2025, 10:54:15 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> seen = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            if(seen.containsKey(nums[i])){
                int distance = Math.abs(seen.get(nums[i]) - i);
                if(distance <= k){
                    return true;
                }
            }
            seen.put(nums[i], i);
        }

        return false;
    }
}