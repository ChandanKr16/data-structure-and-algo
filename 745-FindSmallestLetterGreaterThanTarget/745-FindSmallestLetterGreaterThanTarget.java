// Last updated: 7/23/2025, 10:53:50 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length-1;
        char ans = letters[0];

        while(start <= end){

            int mid = (start + end) / 2;

             if(target < letters[mid]){
                ans = letters[mid];
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            

        }

        return ans; 
        

    }
}