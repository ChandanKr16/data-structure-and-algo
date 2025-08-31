// Last updated: 8/31/2025, 6:17:07 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int maxCount = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int n = fruits.length;

        while(end < n){

            count++;
            map.put(fruits[end], map.getOrDefault(fruits[end], 0)+1);

           // if(map.size() <= 2){
                
            //}

            while(map.size() > 2){

                map.put(fruits[start], map.get(fruits[start])-1);
                if(map.get(fruits[start]) == 0)
                    map.remove(fruits[start]);
                count--;   
                start++;            

            }

            maxCount = Math.max(count, maxCount);

            end++;

        }
        


        return maxCount;       
    }
}