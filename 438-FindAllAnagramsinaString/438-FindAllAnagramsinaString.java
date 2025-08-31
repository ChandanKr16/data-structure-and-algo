// Last updated: 8/31/2025, 10:29:31 PM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int start = 0;
        int end = 0;
        int count = 0;
        int n = s.length();

        for(char ch : p.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        while(end < n){

            char ch = s.charAt(end);

            map2.put(ch, map2.getOrDefault(ch, 0)+1);

            if(map2.get(ch).intValue() == map.getOrDefault(ch, 0).intValue())
                count++;

            if(!map.containsKey(ch)){
                map2.clear();
                start = end+1;
                count = 0;
            }

            if(map.equals(map2))
                result.add(start);


            while(count == map.size()){
                char startCh = s.charAt(start++);
                map2.put(startCh, map2.get(startCh)-1);

                if(map.containsKey(startCh))
                    count--;
                  if(map2.get(startCh) == 0){
                    map2.remove(startCh);
                }     
            }

            while(map2.getOrDefault(ch, 0).intValue() > map.getOrDefault(ch, 0).intValue()){
                char startCh = s.charAt(start++);
                map2.put(startCh, map2.get(startCh)-1); 
                if(map2.get(startCh) == 0){
                    map2.remove(startCh);
                }

                 if(map.containsKey(startCh)){
                    count--;
                }

                if(map.equals(map2)){
                 //System.out.println(map2);
                 result.add(start);
            }

            }

           

            end++;
        }

        return result;              
    }
}