// Last updated: 7/23/2025, 10:53:35 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int shuffledArr[] = new int[nums.length];
        int i = 0;
        int j = n;
        int k = -1;

       while(k < nums.length-1){
            shuffledArr[++k] = nums[i++];
            shuffledArr[++k] = nums[j++];
            
        }

        return shuffledArr;
    }
}