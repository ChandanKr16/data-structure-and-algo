// Last updated: 7/23/2025, 10:54:04 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int arr1[] = new int[1001];
        int arr2[] = new int[1001];
        List<Integer> commonElements = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            arr1[nums1[i]] = 1;
        }

        for(int i = 0; i < nums2.length; i++){
            arr2[nums2[i]] = 1;
        }

        for(int i = 0; i < 1001; i++){
            if(arr1[i] == 1 && arr2[i] == 1){
                commonElements.add(i);
            }
        }

        int result[] = new int[commonElements.size()];

        for(int i = 0; i < result.length; i++){
            result[i] = commonElements.get(i);
        }

        return result;       

    }
}