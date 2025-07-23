// Last updated: 7/23/2025, 10:53:49 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0; i < image.length; i++){
            flip(image[i]);
            invert(image[i]);

        }

        return image;

    }

    public void invert(int arr[]){
        for(int i = 0; i < arr.length; i++){
            arr[i] ^= 1;
        }
    }



    public void flip(int arr[]){
        int start = 0; 
        int end = arr.length -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}