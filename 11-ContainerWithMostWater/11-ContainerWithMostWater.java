// Last updated: 8/19/2025, 7:49:25 AM
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxWater = 0;

        while(left < right){
            int water = Math.min(height[right] , height[left]) *  (right - left);
            maxWater = Math.max(water, maxWater);

            if(height[left] > height[right]){
                right--;
            }
            else if(height[left] < height[right]){
                left++;
            }
            else{
                left++;
                right--;
            }
        }


        return maxWater;
    }
}