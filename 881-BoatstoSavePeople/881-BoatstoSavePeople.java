// Last updated: 9/5/2025, 7:27:08 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int start = 0;
        int end = people.length-1;
        int sum = 0;

        Arrays.sort(people);

        while(start <= end){

            
           if(people[start] + people[end] <= limit){
                start++;
                end--;
                count++;
            }
            else {
                count++;
                end--;
            }

            
             
           
        }

        


        return count;
    }
}