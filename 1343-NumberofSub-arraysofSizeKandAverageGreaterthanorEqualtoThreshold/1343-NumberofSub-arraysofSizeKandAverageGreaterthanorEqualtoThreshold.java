// Last updated: 8/19/2025, 8:39:39 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int start = 0;


        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(i >= k-1){
                int avg = sum / k;
                if(avg >= threshold){
                    count++;
                }
                sum = sum - arr[start++];
            }
        }

        return count;
    }
}