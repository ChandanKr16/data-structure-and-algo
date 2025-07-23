// Last updated: 7/23/2025, 10:53:37 PM
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for(int i : nums1){
            set1.add(i);
        }

        for(int i : nums2){
            set2.add(i);
        }

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int entry : set1){
            if(!set2.contains(entry)){
                list1.add(entry);
            }
        }

        for(int entry : set2){
            if(!set1.contains(entry)){
                list2.add(entry);
            }
        }

        result.add(list1);
        result.add(list2);


        return result;
    }
}