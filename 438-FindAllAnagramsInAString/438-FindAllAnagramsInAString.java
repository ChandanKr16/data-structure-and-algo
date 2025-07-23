// Last updated: 7/23/2025, 10:53:57 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char ch : p.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);            
        }

        int matched = 0;
        int start = 0;


        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            

            if(map.containsKey(ch)){
                map2.put(ch, map2.getOrDefault(ch, 0)+1);
            }

            // if(map.containsKey(ch) && map2.get(ch).intValue() == map.get(ch).intValue()){
            //     ++matched;
            // }

            
            if(i >= p.length()-1){

                char x = s.charAt(start);
               

                if(map.equals(map2)){
                    result.add(start);
                }

                if(map.containsKey(x)){
                     map2.put(x, map2.get(x)-1);
                    if(map2.get(x) == 0) {
                        map2.remove(x);
                    }
                }

                start++;

            }

        }

        return result;       
    }
}