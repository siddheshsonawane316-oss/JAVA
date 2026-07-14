package JAVA.Arrays.Basics;

public class SortColorsDutch {
    static void main() {

        int arr[] = {2, 0, 2, 1, 1, 0};

        // Marks the end of 0's region
        int low = 0;

        // Current element being processed
        int mid = 0;

        // Marks the start of 2's region
        int high = arr.length - 1;

        int temp = 0;

        // Process until mid crosses high
        while (mid <= high) {

            if (arr[mid] == 0) {

                // Place 0 at the beginning
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 2) {

                // Place 2 at the end
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high--;

            } else {

                // 1 is already in the correct region
                mid++;
            }
        }

        // Print sorted array
        for (int i : arr) {
            System.out.println(i);
        }
    }
}