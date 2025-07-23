// Last updated: 7/23/2025, 10:53:46 PM
class Solution {
    public int[][] transpose(int[][] matrix) {

        int transposedMatrix[][] = new int[matrix[0].length][];

        for(int i = 0; i < transposedMatrix.length; i++){
            transposedMatrix[i] = new int[matrix.length];
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transposedMatrix[j][i] = matrix[i][j];

            }
        }

        return transposedMatrix;
    }
}