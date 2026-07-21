package JAVA.Arrays.Basics;

public class RemoveElement {

    static void main() {

        // Input array
        int arr[] = {0, 1, 2, 2, 3, 0, 4, 2};

        // Read pointer
        int r = 0;

        // Write pointer
        int w = 0;

        // Value to be removed
        int value = 2;

        // Traverse the entire array
        while (r < arr.length) {

            // Skip the element if it matches the value to remove
            if (arr[r] == value) {
                r++;
            } else {
                // Copy the current element to the write position
                arr[w] = arr[r];

                // Move the write pointer to the next position
                w++;

                // Move the read pointer to the next element
                r++;
            }
        }

        // Print the array after removing the specified value
        // Only print up to 'w' because the remaining elements are irrelevant
        for (int i = 0; i < w; i++) {
            System.out.println(arr[i]);
        }
    }
}