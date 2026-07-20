package JAVA.Arrays.Basics;

public class EvenNumToFront {
    static void main() {

        int[] arr = {3, 8, 5, 2, 7, 4, 1, 6, 9, 10, 11, 12};

        // Points to the next position where an even number should be placed
        int w = 0;

        // Scans the entire array
        int r = 0;

        // Traverse the array
        while (r < arr.length) {

            // Found an even number
            if (arr[r] % 2 == 0) {

                // Place the even number at the front
                int temp = arr[w];
                arr[w] = arr[r];
                arr[r] = temp;

                // Move to the next position for an even number
                w++;
            }

            // Continue scanning the array
            r++;
        }

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}