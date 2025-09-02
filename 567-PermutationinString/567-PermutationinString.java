// Last updated: 9/2/2025, 10:30:20 PM
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        int start = 0, end = 0;
        Map<Character, Integer> pattern = new HashMap<>();
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch : s1.toCharArray()){
            pattern.put(ch, pattern.getOrDefault(ch, 0)+1);
        }

        while(end < s1.length()-1){
            char ch = s2.charAt(end++);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        while(end < s2.length()){

             char ch = s2.charAt(end);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);

            if(freq.equals(pattern)) return true;

            while(end - start + 1 >= s1.length()){

                char startCh = s2.charAt(start++);
                freq.put(startCh, freq.get(startCh)-1);

                if(freq.get(startCh)== 0)
                    freq.remove(startCh);               

            }

            end++;
           
        }
       
        
        return false;
    }
}