// Last updated: 8/13/2025, 8:44:13 PM
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        //-4 -1 -1 0 1 2
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);
        int last = arr.length-1;
        int start = 1;

        for(int i = 0; i < arr.length; i++){

            if(i > 0 && arr[i] == arr[i-1])
                continue;

            start = i+1;
           last = arr.length-1;

            
            while(start < last){

                int sum = arr[start] + arr[i] + arr[last];

                if(sum > 0){
                    last--;
                }
                else if(sum < 0){
                    start++;
                }
                else{

                    result.add(new ArrayList<>(List.of(arr[i], arr[start], arr[last])));

                    start++;
                    last--;

                while(start < last && arr[start] == arr[start-1]){
                    start++;
                }

                while(start < last && arr[last] == arr[last+1]){
                    last--;
                }

            }

            }
            

            
            
        }

        return result;   

    }
}