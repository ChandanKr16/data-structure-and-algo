// Last updated: 4/3/2026, 11:45:32 AM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int left = 0, right = nums.length-1;
4
5        int sortedSquares[] = new int[nums.length];
6        int insertPointer = right;
7
8        while(left <= right){
9            int leftSq = nums[left]*nums[left];
10            int rightSq = nums[right]*nums[right];
11
12            if(leftSq > rightSq){
13                sortedSquares[insertPointer--] = leftSq;
14                left++;
15            }
16            else {
17                sortedSquares[insertPointer--] = rightSq;
18                right--;
19            }
20            
21        }
22
23        return sortedSquares;
24    }
25}