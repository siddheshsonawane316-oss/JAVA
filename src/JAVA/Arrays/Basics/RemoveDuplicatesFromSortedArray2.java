package JAVA.Arrays.Basics;

public class RemoveDuplicatesFromSortedArray2 {
    static void main() {

        int arr[] = {0,0,1,1,1,1,2,3,3};

        // Points to the last valid element
        int w = 1;

        // Scans the remaining array
        int r = 2;

        // Traverse the array
        while (r < arr.length) {
            // Skip if it becomes the third occurrence
            if (arr[w] == arr[r] && arr[w - 1] == arr[r]) {
                r++;
            } else {

                // Keep the current element
                arr[w + 1] = arr[r];

                w++;
                r++;
            }
        }

        // Print the valid part of the array
        for (int i = 0; i <= w; i++) {
            System.out.println(arr[i]);
        }
    }
}