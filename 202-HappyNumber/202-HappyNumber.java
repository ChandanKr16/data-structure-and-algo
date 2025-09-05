// Last updated: 9/5/2025, 7:58:51 PM
class Solution {
    public boolean isHappy(int n) {
        
        if(n == 1) return true;

        int prev = 0, sq = 0;

        Set<Integer> set = new HashSet<>();

        while(true){

            int temp = n;
            sq = 0;

            while(temp > 0){
                sq = sq + (temp % 10) * (temp % 10);
                temp = temp / 10;
            }

            if(sq == 1) return true;

            if(set.contains(sq)) return false;

            set.add(sq);

            n = sq;

        } 

        //return false;
    }
}