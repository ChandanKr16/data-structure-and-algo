// Last updated: 7/23/2025, 10:54:39 PM
class Solution {
    public int strStr(String haystack, String needle) {

        int needleLen = needle.length();
        int haystackLen = haystack.length();
        
        if(needleLen > haystackLen) return -1;

        for(int i = 0; i < haystackLen; i++){
            int start = i;
            int len = 0;
            for(int j = 0; j < needleLen; j++){
                if(start < haystackLen && haystack.charAt(start) == needle.charAt(j)){
                    ++start;
                    ++len;
                }
            }

            if(len == needleLen) 
                return i;
        }

        return -1;

    }
}