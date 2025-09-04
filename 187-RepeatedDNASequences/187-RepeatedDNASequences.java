// Last updated: 9/4/2025, 7:57:49 AM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> strFreq = new HashMap<>();

        for(int i = 0; i <= s.length()-10; i++){

            String substring = s.substring(i, i+10);

            strFreq.put(substring, strFreq.getOrDefault(substring, 0)+1);

            if(strFreq.get(substring) ==2)
                result.add(substring);

        }


        return result;
    }
}