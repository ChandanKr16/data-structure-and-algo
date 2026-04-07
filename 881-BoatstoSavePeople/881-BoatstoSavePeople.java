// Last updated: 4/7/2026, 8:55:02 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3
4        Arrays.sort(people);
5
6        int boatCount = 0, left = 0, right = people.length-1;
7
8        while(left < right){
9            int sum = people[left] + people[right];
10
11            if(sum <= limit){
12                boatCount++;
13                left++;
14                right--;
15            }
16            else if(sum > limit){
17                boatCount++;
18                right--;
19            }
20        }
21
22        if(right-left == 0) boatCount++;
23        
24
25        return boatCount;
26    }
27}