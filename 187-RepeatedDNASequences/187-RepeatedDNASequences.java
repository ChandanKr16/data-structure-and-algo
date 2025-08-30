// Last updated: 8/30/2025, 8:16:50 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        int start = 0;
        Map<String, Integer> map = new HashMap<>();
        

        for(int i = 0; i <= s.length()-10; i++){
            String substr = s.substring(start, i+10);  

            map.put(substr, map.getOrDefault(substr, 0)+1);

            if(map.get(substr) == 2){
                result.add(substr);
            } 
            start++; 
        }

       

        return result;
    }
}