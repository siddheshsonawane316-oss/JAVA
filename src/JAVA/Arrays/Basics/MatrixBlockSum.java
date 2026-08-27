package JAVA.Arrays.Basics;

public class MatrixBlockSum {

    static void main(String[] args) {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int k = 1;

        // Create 2D prefix sum matrix with an extra row and column
        int prefix[][] = new int[mat.length + 1][mat[0].length + 1];

        // Store the final block sums
        int res[][] = new int[mat.length][mat[0].length];

        // Build the 2D prefix sum matrix
        for (int i = 1; i <= mat.length; i++) {
            for (int j = 1; j <= mat[0].length; j++) {

                // Current value + top + left - overlapping top-left
                prefix[i][j] = mat[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        // Calculate block sum for every cell
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {

                // Find the block boundaries around the current cell
                int x1 = Math.max(i - k, 0);
                int c1 = Math.max(j - k, 0);
                int x2 = Math.min(i + k, res.length - 1);
                int c2 = Math.min(j + k, res[0].length - 1);

                // Convert matrix indices to prefix sum indices
                x1++;
                c1++;
                x2++;
                c2++;

                // Use the four-corner formula to get the block sum
                res[i][j] = prefix[x2][c2]
                        - prefix[x2][c1 - 1]
                        - prefix[x1 - 1][c2]
                        + prefix[x1 - 1][c1 - 1];
            }
        }

        // Print the result matrix
        for (int i = 0; i < res.length; i++) {
            System.out.print("[");

            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }

            System.out.print("],");
        }
    }
}