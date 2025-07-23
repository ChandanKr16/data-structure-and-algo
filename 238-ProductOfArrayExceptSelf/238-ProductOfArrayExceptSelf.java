// Last updated: 7/23/2025, 10:54:11 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
               
        int result[] = new int[nums.length];
        int multi = 1;

        for(int i = 0; i < nums.length; i++){
            result[i] = multi;
            multi *= nums[i];
        }  

        multi = 1;

        for(int i = nums.length-1; i >= 0; i--){
            result[i] *= multi;
            multi *= nums[i];
        }
        
       
       return result;   

    }
}