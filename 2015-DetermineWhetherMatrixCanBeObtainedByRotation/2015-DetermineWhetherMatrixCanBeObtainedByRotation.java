// Last updated: 7/23/2025, 10:53:25 PM
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int i = 0; i <= 3; i++){
            rotate(mat);

            if(checkIfEqual(mat, target)){
                return true;
            }

        }

        return false;

    }

    public boolean checkIfEqual(int mat[][], int tgt[][]){

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] != tgt[i][j])
                    return false;
            }
        }

        return true;
    }

    public void rotate(int mat[][]){

        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[i].length; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0; i < mat.length; i++){
            int start = 0;
            int end = mat.length - 1;

            while(start < end){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }

    }



}