// Last updated: 8/16/2025, 8:09:38 PM
class Solution {
    public int trap(int[] height) {
    
        int size = height.length;
        int trappedWater = 0;
        int leftPrefix[] = new int[size];
        int rightPrefix[] = new int[size];

        leftPrefix[0] = height[0];
        rightPrefix[size-1] = height[size-1];

        for(int i = 1; i < size; i++){
            leftPrefix[i] = Math.max(height[i], leftPrefix[i-1]);
        }

        for(int i = size - 2; i >= 0; i--){
            rightPrefix[i] = Math.max(height[i], rightPrefix[i+1]);
        }

        for(int i = 0; i < size; i++){
            trappedWater += Math.min(leftPrefix[i], rightPrefix[i]) - height[i];
        }

        

        return trappedWater;
    }
}