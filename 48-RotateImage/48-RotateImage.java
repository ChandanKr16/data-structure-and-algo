// Last updated: 7/23/2025, 10:54:33 PM
class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            int start = 0;
            int end = matrix.length - 1;

            while(start < end){
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
}