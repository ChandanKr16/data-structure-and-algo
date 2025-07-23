// Last updated: 7/23/2025, 10:53:44 PM
class Solution {
    public int totalFruit(int[] fruits) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        int start = 0;
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < fruits.length; i++){
            freq.put(fruits[i], freq.getOrDefault(fruits[i], 0)+1);

            count++;

            if(freq.size() > 2){
               
                int fruit = fruits[start++];
               
                count--;

                freq.put(fruit, freq.get(fruit)-1);
                
                if(freq.get(fruit) == 0){
                    freq.remove(fruit);
               }
            }

            maxCount = Math.max(count, maxCount);
        }

        return maxCount;       

    }
}