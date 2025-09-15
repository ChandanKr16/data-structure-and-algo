// Last updated: 9/15/2025, 7:54:00 AM
class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int result[] = new int[nums1.length];
        int j = 0;
        for(int num : nums1){
            boolean isFound = false;
            result[j] = -1;
            for(int i = 0; i < nums2.length; i++){

                if(isFound == true && nums2[i] > num){
                    result[j] = nums2[i];
                    break;
                }

                if(nums2[i] == num){
                    isFound = true;
                }

            }
            j++;

        }

        return result;
    }
}