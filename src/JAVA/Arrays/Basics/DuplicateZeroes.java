package JAVA.Arrays.Basics;

public class DuplicateZeroes {
    static void main() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};

        // Count total zeros
        int zeroes = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroes++;
            }
        }

        // w -> Current element
        // r -> Current position in imaginary array
        int w = arr.length - 1;
        int r = arr.length + zeroes - 1;

        while (w >= 0) {

            // Write current element if inside the array
            if (r < arr.length) {
                arr[r] = arr[w];
            }

            // Write one more zero for duplicate
            if (arr[w] == 0) {
                r--;
                if (r < arr.length) {
                    arr[r] = 0;
                }
            }

            // Move to previous element
            w--;

            // Move to previous position
            r--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}