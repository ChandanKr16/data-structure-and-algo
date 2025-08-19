// Last updated: 8/19/2025, 8:05:49 AM
class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int n = height.length;
        int leftPrefix[] = new int[n];
        int rightPrefix[] = new int[n];
        leftPrefix[0] = height[0];
        rightPrefix[n - 1] = height[n - 1];

        for (int i = 1; i < n; i++) {
            leftPrefix[i] = Math.max(leftPrefix[i - 1], height[i]);
        }


        for(int i = n-2; i >= 0; i--){
            rightPrefix[i] = Math.max(rightPrefix[i+1], height[i]);
        }

        for(int i = 0; i < n; i++){
            trappedWater += Math.min(leftPrefix[i], rightPrefix[i]) - height[i];
        }

        return trappedWater;

    }
}