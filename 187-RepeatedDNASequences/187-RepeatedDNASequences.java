// Last updated: 8/30/2025, 8:16:59 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
    
        Map<String, Integer> map = new HashMap<>();
        

        for(int i = 0; i <= s.length()-10; i++){
            String substr = s.substring(i, i+10);  

            map.put(substr, map.getOrDefault(substr, 0)+1);

            if(map.get(substr) == 2){
                result.add(substr);
            } 
           
        }

       

        return result;
    }
}