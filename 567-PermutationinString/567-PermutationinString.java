// Last updated: 8/8/2025, 9:28:48 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }     


       int matched = 0;
        int start = 0;
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);

            if(map.get(ch) == 0){
                matched++;
            }
            }


            if(matched == map.size()) return true;
            

            if(i >= s1.length()-1){
                char x = s2.charAt(start++);



                if(map.containsKey(x)){
                    
                    if(map.get(x) == 0)
                        matched--;

                    map.put(x, map.get(x)+1);
                }
            }

            
        }

       


        return false;
    }
}