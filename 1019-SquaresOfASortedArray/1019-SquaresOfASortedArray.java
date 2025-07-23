// Last updated: 7/23/2025, 10:53:41 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int idx = end;
        int result[] = new int[nums.length];

        while(start <= end){

            int startSq = nums[start]*nums[start];
            int endSq = nums[end]*nums[end];

            if(startSq > endSq){
                result[idx] = startSq;
                start++;
                idx--;
            }
            else {
                result[idx] = endSq;
                idx--;
                end--;
            }
           
           

        }

      

        return result;

    }
}