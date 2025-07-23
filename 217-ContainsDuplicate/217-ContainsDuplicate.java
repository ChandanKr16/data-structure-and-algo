// Last updated: 7/23/2025, 10:54:16 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> unique = new HashSet<>();

        for(int i : nums){
            if(unique.contains(i))
                return true;
            unique.add(i);
        }

        return false;

    }
}