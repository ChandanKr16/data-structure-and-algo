// Last updated: 8/30/2025, 7:55:07 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        int start = 0;
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i = 0; i <= s.length()-10; i++){
            String substr = s.substring(start, i+10);  

            map.put(substr, map.getOrDefault(substr, 0)+1);

            if(map.get(substr) > 1){
                set.add(substr);
            } 
            start++; 
        }

        result.addAll(set);

        return result;
    }
}