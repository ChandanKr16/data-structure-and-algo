// Last updated: 9/2/2025, 11:33:25 PM
class Solution {
    public String minWindow(String s, String t) {
        int start = 0, end = 0, startStrIdx = 0, len = Integer.MAX_VALUE, count = 0;
        Map<Character, Integer> pattern = new HashMap<>();
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : t.toCharArray()){
            pattern.put(ch, pattern.getOrDefault(ch, 0)+1);
        }

        while(end < s.length()){

            char ch = s.charAt(end);
            
            freq.put(ch, freq.getOrDefault(ch, 0)+1);

            if(pattern.getOrDefault(ch, 0).intValue() == freq.get(ch).intValue()){
                count++;
            }

            while(count == pattern.size()){

                if(end - start + 1 < len){
                    startStrIdx = start;
                    len = end - start + 1;
                }

                char startCh = s.charAt(start++);

                freq.put(startCh, freq.get(startCh)-1);

                if(pattern.containsKey(startCh)){
                    if(freq.get(startCh) < pattern.get(startCh))
                        count--;
                }

            }

            end++;

        }



        return len == Integer.MAX_VALUE ? "" : s.substring(startStrIdx, startStrIdx+len);
    }
}