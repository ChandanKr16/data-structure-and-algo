// Last updated: 7/23/2025, 10:53:32 PM
class Solution {


    public int[] frequencySort(int[] nums) {
   
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        Integer numObj[] = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++){
            numObj[i] = nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        
        Arrays.sort(numObj, (a, b) -> {
            if(freq.get(a).equals(freq.get(b))){
                return Integer.compare(b, a);
            }
            return Integer.compare(freq.get(a), freq.get(b));
        });

        for(int i = 0; i < nums.length; i++){
            nums[i] = numObj[i];
        }
        
        return nums;

    }
}