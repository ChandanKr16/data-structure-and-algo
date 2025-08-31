// Last updated: 8/31/2025, 7:08:06 PM
class Solution {
    public String minWindow(String s, String t) {

        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        int start = 0;
        int end = 0;
        int n = s.length();
        int minWindow = Integer.MAX_VALUE;
        int startStrIdx = 0;
        int count = 0;

        for(char ch : t.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }       
        
        while(end < n){
            char ch = s.charAt(end);
            
            freq2.put(ch, freq2.getOrDefault(ch, 0)+1);

            if(freq.containsKey(ch) && freq2.get(ch).intValue() == freq.get(ch).intValue())
                count++;
            
            while(count == freq.size()){

                if(end - start + 1 < minWindow){
                    minWindow = Math.min(minWindow, end - start+1);
                    startStrIdx = start;
                }

                char startCh = s.charAt(start++);

                freq2.put(startCh, freq2.get(startCh)-1);

                if(freq.getOrDefault(startCh, 0) > freq2.get(startCh))
                    count--;
            }

            end++;



        }

        return minWindow == Integer.MAX_VALUE ? "" : s.substring(startStrIdx, startStrIdx+minWindow);

        
    }
}