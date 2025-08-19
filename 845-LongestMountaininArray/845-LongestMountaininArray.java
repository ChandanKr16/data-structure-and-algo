// Last updated: 8/19/2025, 7:44:48 AM
class Solution {
    public int longestMountain(int[] arr) {

        int max = 0;

        if(arr.length < 3) return 0;

        for(int i = 1; i < arr.length-1; i++){
            
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){

                int left = i;
                int right = i;

                while(left > 0 && arr[left] > arr[left-1]) left--;
                while(right < arr.length-1 && arr[right] > arr[right+1]) right++;

                max = Math.max(max, right-left+1);

            }
        }

        return max;
    }
}