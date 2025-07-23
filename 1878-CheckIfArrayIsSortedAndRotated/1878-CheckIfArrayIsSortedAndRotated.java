// Last updated: 7/23/2025, 10:53:29 PM
class Solution {
    public boolean check(int[] nums) {
        
      int count = 0;

      for(int i = 0; i < nums.length; i++){
          if(nums[i] > nums[(i + 1) % nums.length])
            ++count;
      }

      return count <= 1;

    }
}