public class Solution{
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) { //rows
            for (int j = 0; j < n; j++) { //cols
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }// this one is for first part
        //TC: On^2 + o(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rotated[i][j];
            }
        }
    }
}