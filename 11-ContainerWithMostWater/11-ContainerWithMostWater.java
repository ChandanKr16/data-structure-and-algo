// Last updated: 7/23/2025, 10:54:51 PM
class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0, right = height.length-1;


        while(left < right){

            int water = Math.min(height[left] ,  height[right])*(right-left);

            maxWater = Math.max(water, maxWater);

            if(height[left] > height[right]){
                right--;
            }
            else {
                left++;
            }
            // else {
            //     left++;
            //     right--;
            // }


        }

        return maxWater;
    }
}