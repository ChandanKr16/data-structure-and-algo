// Last updated: 8/20/2025, 8:05:51 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int maxCount = 0;
        int count = 0;
        int start = 0;
        int end = 0;
        
        Map<Integer, Integer> map = new HashMap<>();


        while(end < fruits.length){
            
            map.put(fruits[end], map.getOrDefault(fruits[end], 0)+1);
            count++;

            while(map.size() > 2){
                map.put(fruits[start], map.get(fruits[start])-1);
                count--;
                if(map.get(fruits[start]) == 0)
                    map.remove(fruits[start]);
                start++;
            }
            maxCount = Math.max(maxCount, count);

            end++;

        }

        return maxCount;
        

       
    }
}