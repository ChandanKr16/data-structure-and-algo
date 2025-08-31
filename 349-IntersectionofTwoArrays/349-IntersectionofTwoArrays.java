// Last updated: 8/31/2025, 5:54:39 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums1){
            set.add(num);
        }
        
        Set<Integer> result = new HashSet<>();

        for(int num : nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}