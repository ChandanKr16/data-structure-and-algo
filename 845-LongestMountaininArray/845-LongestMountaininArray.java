// Last updated: 9/5/2025, 11:15:30 AM
class Solution {
    public int longestMountain(int[] arr) {
        int maxLen = 0;

        for(int i = 1; i < arr.length-1; i++){
            int left = i;
            int right = i;

            if(arr[left-1] < arr[left] && arr[right] > arr[right+1]){
                while(left > 0 && arr[left-1] < arr[left])
                    left--;

                while(right < arr.length-1 && arr[right] > arr[right+1])
                    right++;
                maxLen = Math.max(maxLen, right - left+1);
            }


            
        }


        return maxLen ;
    }
}