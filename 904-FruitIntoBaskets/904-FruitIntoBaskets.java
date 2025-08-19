// Last updated: 8/19/2025, 8:10:05 PM
class Solution {
    public int totalFruit(int[] fruits) {

        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int start = 0;

        for(int i = 0; i < fruits.length; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i], 0)+1);
            count++;

            if(map.size() <= 2){
                maxCount = Math.max(maxCount, count);
            }    

            while(map.size() > 2){
                
                map.put(fruits[start], map.get(fruits[start])-1);
                count--;

                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }        
        }

        return maxCount;
    }
}