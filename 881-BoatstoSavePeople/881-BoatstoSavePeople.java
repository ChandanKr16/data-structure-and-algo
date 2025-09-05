// Last updated: 9/5/2025, 7:23:56 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int start = 0;
        int end = people.length-1;
        int sum = 0;

        Arrays.sort(people);

        while(start <= end){

            if(people[start] == limit){
                 count++;
                 start++;
            }
            
            else if(people[end] == limit){
                count++;
                end--;
            }

            else if(people[start] + people[end] <= limit){
                start++;
                end--;
                count++;
            }
            else if(people[start]+people[end] > limit){
                count++;
                end--;
            }

            
             
           
        }

        


        return count;
    }
}