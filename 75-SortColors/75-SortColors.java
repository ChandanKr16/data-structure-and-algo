// Last updated: 8/22/2025, 8:00:41 PM
class Solution {

    public String minWindow(String str, String pattern) {
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int startIdx = 0;
        int matched = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : pattern.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

                    Map<Character, Integer> map2 = new HashMap<>();

       
        for(int end = 0; end < str.length(); end++){
            char ch = str.charAt(end);


            map2.put(ch, map2.getOrDefault(ch, 0)+1);

            if(map.containsKey(ch) && map2.get(ch).intValue() == map.get(ch).intValue()){
                matched++;
            }

            while(matched == map.size()){

                if(end - start + 1 < minLen){
                    minLen = Math.min(end-start+1, minLen);
                    startIdx = start;
                }

                char leftCh = str.charAt(start++);

                map2.put(leftCh, map2.getOrDefault(leftCh, 0)-1);

                if(map2.get(leftCh) < map.getOrDefault(leftCh, 0)){
                    matched--;
                }
                

            }


        }

        return minLen == Integer.MAX_VALUE  ? "" : str.substring(startIdx, startIdx+minLen);
    }
}