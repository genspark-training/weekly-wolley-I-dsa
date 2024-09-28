// Problem: Search for a number X in a matrix where each row and column is sorted in increasing order.
// Input: N - number of rows
//        M - number of columns
//        mat - 2D matrix of size N x M
//        X - number to search for
// Output: Return 1 if X is found, else return 0

public class MatrixSearch {

    public static int matSearch(int N, int M, int[][] mat, int X) {
        
        int row = 0;
        int col = M - 1;

        while (row < N && col >= 0) {
            if (mat[row][col] == X) {
                return 1;  
            } else if (mat[row][col] > X) {
                col--;  
            } else {
                row++;  
            }
        }

        return 0; 
    }

    public static void main(String[] args) {
        // Test case 1
        int[][] mat1 = {
            {3, 30, 38},
            {44, 52, 54},
            {57, 60, 69}
        };
        int N1 = 3;
        int M1 = 3;
        int X1 = 62;
        System.out.println(matSearch(N1, M1, mat1, X1));  // Expected Output: 0

        // Test case 2
        int[][] mat2 = {
            {3, 30, 38},
            {44, 52, 54},
            {57, 60, 69}
        };
        int N2 = 3;
        int M2 = 3;
        int X2 = 52;
        System.out.println(matSearch(N2, M2, mat2, X2));  // Expected Output: 1
    }
}
