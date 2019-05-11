class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int l = 0; l < length / 2; l++){
            int r = length - 1 - l;
            for(int p = l; p < r; p++){
                int q = length - 1 - p;
                int temp = matrix[l][p];
                matrix[l][p] = matrix[q][l];
                matrix[q][l] = matrix[r][q];
                matrix[r][q] = matrix[p][r];
                matrix[p][r] = temp;
            }
        }

    }
}