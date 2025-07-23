// Last updated: 7/23/2025, 10:53:18 PM
class Solution {

    public int countGoodSubstrings(String s) {
        int count = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);


            if(i >= 2){

                if(map.size() == 3){
                    count++;
                }

                char leftCh = s.charAt(start++);

                map.put(leftCh, map.get(leftCh)-1);

                if(map.get(leftCh) == 0)
                    map.remove(leftCh);

            }

        }
        
        
        return count;
    }
}