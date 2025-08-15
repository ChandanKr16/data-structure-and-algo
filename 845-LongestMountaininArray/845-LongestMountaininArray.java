// Last updated: 8/15/2025, 7:15:32 PM
class Solution {
    public int longestMountain(int[] arr) {
        int max = 0;

        if(arr.length < 3) return 0;

        for(int i = 1; i < arr.length-1; i++){

           if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
             int left = i;
            int right = i;

            while(left > 0 && arr[left-1] < arr[left]){
                left--;
            }

            while(right < arr.length-1 && arr[right+1] < arr[right]){
                right++;
            }

            max = Math.max(max, right-left+1);          

           }
        }

        if(max < 3) return 0;

        
        return max;
    }
}