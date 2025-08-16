// Last updated: 8/16/2025, 8:14:02 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxWater = 0;

        while(left < right){
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater = Math.max(maxWater, water);

            if(height[left] > height[right]){
                right--;
            }
            else if(height[left] < height[right]) {
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