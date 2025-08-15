// Last updated: 8/15/2025, 1:06:45 PM
class Solution {
    public int trap(int[] height) {
        
        int leftPrefix[] = new int[height.length];
        int rightPrefix[] = new int[height.length];
        leftPrefix[0] = height[0];
        rightPrefix[height.length-1] = height[height.length-1];

        int trappedWater = 0;
        
        for(int i = 1; i < leftPrefix.length; i++){
            leftPrefix[i] = Math.max(leftPrefix[i-1], height[i]);
        }

        for(int i = height.length-2; i >= 0; i--){
            rightPrefix[i] = Math.max(rightPrefix[i+1], height[i]);
        }

        for(int i = 0; i < height.length; i++){

            trappedWater += Math.min(rightPrefix[i], leftPrefix[i]) - height[i];

        }


        

        return trappedWater;
    }
}