// Last updated: 8/15/2025, 12:49:05 PM
class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxWater = 0;

        while(left < right){

            int currentWater = Math.min(height[left], height[right]) * (right - left);

            maxWater = Math.max(currentWater, maxWater);

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