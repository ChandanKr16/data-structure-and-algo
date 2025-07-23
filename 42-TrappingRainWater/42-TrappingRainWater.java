// Last updated: 7/23/2025, 10:54:35 PM
class Solution {
    public int trap(int[] height) {

        int leftArr[] = new int[height.length];
        int rightArr[] = new int[height.length];

        leftArr[0] = height[0];
        rightArr[height.length-1] = height[height.length-1];

        for(int i = 1; i < height.length; i++){
            leftArr[i] = Math.max(leftArr[i-1], height[i]);
        }

        for(int i = height.length-2; i >= 0; i-- ){
            rightArr[i] = Math.max(rightArr[i+1], height[i]);
        }


        int water = 0;

        for(int i = 0; i < height.length; i++){

            water += Math.min(leftArr[i], rightArr[i]) - height[i];

        }

        
        
        return water;
    }
}