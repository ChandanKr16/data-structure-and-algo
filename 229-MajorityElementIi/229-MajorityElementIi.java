// Last updated: 7/23/2025, 10:54:13 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int count1 = 0, majority1 = 0, count2 = 0, majority2 = 0;

        for(int num: nums){
            if(majority1 == num){
                ++count1;
            }
            else if(majority2 == num){
                ++count2;
            }
            else if(count1 == 0){
                majority1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                majority2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(num == majority1)
                count1++;
            else if(num == majority2)
                count2++;
        }

        List<Integer> result = new ArrayList<>();
        if(count1 > nums.length / 3)
            result.add(majority1);
        if(count2 > nums.length / 3)
            result.add(majority2);

        return result;
    }
}