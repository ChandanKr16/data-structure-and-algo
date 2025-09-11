// Last updated: 9/11/2025, 9:16:27 PM
class Solution {
    public int minSwaps(String s) {
        int swapCounter = 0;
        int balance = 0;

        for(char ch : s.toCharArray()){

            if(ch == ']'){
                balance--;
            }
            else if(ch == '['){
                balance++;
            }

            if(balance < 0){
                swapCounter = Math.max(swapCounter, -balance);
                //balance++;
            }

        }
    

        return (int)Math.ceil((swapCounter+1)/2);
    }
}