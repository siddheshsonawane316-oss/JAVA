package JAVA.Arrays.Basics;

public class ContainerWithMostWater {

    static void main(String[] args) {

        // Heights of the vertical lines
        int[] cont = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        // Left pointer starts from the beginning
        int l = 0;

        // Right pointer starts from the end
        int r = cont.length - 1;

        // Stores the maximum area found so far
        int max = 0;

        // Stores the width between the two pointers
        int width = 0;

        // Continue until both pointers meet
        while (l < r) {

            // Calculate the width of the current container
            width = r - l;

            // Area = Width × Height of the shorter wall
            max = Math.max(max, width * Math.min(cont[l], cont[r]));

            // Move the pointer pointing to the shorter wall,
            // since only that gives a chance of finding a larger area.
            if (cont[l] > cont[r]) {
                r--;
            } else {
                l++;
            }
        }

        // Print the maximum water that can be stored
        System.out.println(max);
    }
}