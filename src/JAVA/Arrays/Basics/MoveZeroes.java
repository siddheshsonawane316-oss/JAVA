package JAVA.Arrays.Basics;

public class MoveZeroes {
    static void main(String[] args) {
        int arr[] = {0, 1, 12, 0};

        // Points to the next position for a non-zero element
        int w = 0;

        // Scans the entire array
        int r = 0;

        // Traverse the array
        while (r < arr.length) {

            // Found a non-zero element
            if (arr[r] != 0) {

                // Place the non-zero element at the front
                int temp = arr[w];
                arr[w] = arr[r];
                arr[r] = temp;

                // Move to the next position
                w++;
            }

            // Continue scanning
            r++;
        }

        // Print the modified array
        for (int i : arr) {
            System.out.println(i);
        }
    }
}