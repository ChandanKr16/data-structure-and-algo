// Last updated: 7/27/2025, 6:12:52 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();


        

        for(int i = 0; i <= s.length()-10; i++){

            String subString = s.substring(i, i+10);

            map.put(subString, map.getOrDefault(subString, 0)+1);

            if(map.get(subString) == 2){
                result.add(subString);
            }


        }


        return result;
    }
}