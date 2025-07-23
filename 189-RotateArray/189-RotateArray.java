// Last updated: 7/23/2025, 10:54:19 PM
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k %= n;

        // if(n <= 1) return;
        
        // if(k > n)
        //     k = k % n;
        

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }


    public void reverse(int arr[], int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;           
        }

    }

}