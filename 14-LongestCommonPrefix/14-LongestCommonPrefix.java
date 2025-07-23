// Last updated: 7/23/2025, 10:54:49 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String subString = strs[0];
        boolean flag = false;

        for(int i = 1; i < strs.length; i++){

            int j = 0;
            int smallStrSize = subString.length() > strs[i].length() ? strs[i].length() : subString.length();
            
            flag = false;
            StringBuffer temp = new StringBuffer();
            while(j < smallStrSize && subString.charAt(j) == strs[i].charAt(j)){
            temp.append(subString.charAt(j));

               j++;
               flag = true;
            }

            subString = temp.toString();


            if(flag == false) return "";
           

        }

        return subString;

    }
}