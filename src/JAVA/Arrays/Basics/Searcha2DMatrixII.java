package JAVA.Arrays.Basics;

/*
Input:
matrix = [
    [1,4,7,11,15],
    [2,5,8,12,19],
    [3,6,9,16,22],
    [10,13,14,17,24],
    [18,21,23,26,30]
]

target = 5

Output: true
*/

public class Searcha2DMatrixII {

    static void main() {

        // 2D matrix
        int matrix[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        // Value we want to search for
        int target = 18;

        // Start from the top-right corner of the matrix
        int row = 0;
        int column = matrix[0].length - 1;

        // Continue while row and column are inside the matrix
        while (row <= matrix.length - 1 && column >= 0) {

            // Store the current element
            int mid = matrix[row][column];

            // Target found
            if (mid == target) {

                // Print the row and column of the target
                System.out.println(row + " " + column);
                break;
            }

            // Current element is greater than target.
            // Move left because the values decrease toward the left.
            else if (mid > target) {
                column--;
            }

            // Current element is smaller than target.
            // Move down because the values increase toward the bottom.
            else if (mid < target) {
                row++;
            }
        }
    }
}