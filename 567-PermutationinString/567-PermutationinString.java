// Last updated: 8/31/2025, 2:43:31 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int end = 0;
        int start = 0;
        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        for(char ch : s1.toCharArray()){
            pCount.put(ch, pCount.getOrDefault(ch, 0)+1);
        }

        while(end < s2.length()){

            char ch = s2.charAt(end);
            sCount.put(ch, sCount.getOrDefault(ch, 0)+1);

            if(end - start + 1 > s1.length()){
                char startCh = s2.charAt(start++);
                sCount.put(startCh, sCount.get(startCh)-1);
                if(sCount.get(startCh) == 0) 
                    sCount.remove(startCh);
            }

             if(pCount.equals(sCount)) 
                    return true;     
           
            end++;
        }
        
        return false;
    }
}