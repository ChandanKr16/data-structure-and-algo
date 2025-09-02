// Last updated: 9/2/2025, 10:10:31 PM
class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
        int start = 0, end = 0, n = s.length(), count = 0;

        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        if(p.length() > s.length()) return result;
        
        for(char ch : p.toCharArray()){
            pCount.put(ch, pCount.getOrDefault(ch, 0)+1);
        }

        for(; end < p.length()-1; end++){
            sCount.put(s.charAt(end), sCount.getOrDefault(s.charAt(end), 0)+1);
        }

        while(end < n){
            char ch = s.charAt(end);

            sCount.put(ch, sCount.getOrDefault(ch, 0)+1);

            if(sCount.equals(pCount)){
                result.add(start);
            }

            
            while(end - start + 1 >= p.length()){
                char startCh = s.charAt(start++);
                sCount.put(startCh, sCount.get(startCh)-1);

                if(sCount.get(startCh) == 0)
                    sCount.remove(startCh);
            }

            end++;
        }


        return result;        
    }
}