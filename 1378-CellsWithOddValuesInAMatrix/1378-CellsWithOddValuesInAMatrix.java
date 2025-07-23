// Last updated: 7/23/2025, 10:53:38 PM
class Solution {
    public int oddCells(int m, int n, int[][] indices) {

        int matrix[][] = new int[m][n]; 
        int oddCount = 0;


        for(int i = 0; i < indices.length; i++){
            int rowIdx = indices[i][0];
            int colIdx = indices[i][1];

            for(int j = 0; j < n; j++)
                matrix[rowIdx][j] += 1;
            
            for(int j = 0; j < m; j++)
                matrix[j][colIdx] += 1;
        }

        

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                if(matrix[i][j] % 2 != 0){
                    ++oddCount;
                }
            }
        }

        return oddCount;

        

    }


}