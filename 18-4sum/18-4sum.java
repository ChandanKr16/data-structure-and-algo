// Last updated: 7/23/2025, 10:54:45 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length-3; i++){
                if (i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i+1; j < nums.length-2; j++){

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                
                int start = j+1;
                int end = nums.length-1;

                while(start < end){

                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];

                    if(sum > target){
                        end--;
                    }
                    else if(sum < target){
                        start++;
                    }
                    else{
                        result.add(new ArrayList<>(List.of(nums[i], nums[j], nums[start], nums[end])));
                        start++;
                        end--;
                        while(start < end && nums[start] == nums[start-1]){
                            start++;
                        }

                        while(start < end && nums[end] == nums[end+1]){
                            end--;
                        }
                    }

                }

            }
        }

        return result;
        

    }
}