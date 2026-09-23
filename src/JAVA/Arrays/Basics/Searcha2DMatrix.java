package JAVA.Arrays.Basics;

public class Searcha2DMatrix {

    static void main() {

        // Starting index of the virtual 1D array
        int l = 0;

        // 2D matrix
        int matrix[][] = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        // Target value we want to search for
        int target = 34;

        // Total number of elements in the matrix
        int h = matrix.length * matrix[0].length-1;

        // Binary search
        while (l <= h) {

            // Find the middle position
            int m = l + (h - l) / 2;

            // Convert the virtual 1D index into a row index
            int row = m / matrix[0].length;

            // Convert the virtual 1D index into a column index
            int column = m % matrix[0].length;

            // Check whether the middle element is the target
            if (matrix[row][column] == target) {

                // Print the row and column where target is found
                System.out.println(row + " " + column);
                break;
            }

            // If the middle element is greater than target,
            // search in the left half
            else if (matrix[row][column] > target) {
                h = m - 1;
            }

            // If the middle element is smaller than target,
            // search in the right half
            else {
                l = m + 1;
            }
        }
    }
}