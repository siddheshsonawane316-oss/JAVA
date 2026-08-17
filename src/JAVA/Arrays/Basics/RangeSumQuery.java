package JAVA.Arrays.Basics;

public class RangeSumQuery {

    static void main() {

        int nums[] = {-2, 0, 3, -5, 2, -1};

        int prefix[] = new int[nums.length + 1];

        // Build prefix sum
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        int left = 2;
        int right = 5;

        // Range sum from left to right
        int sum = prefix[right + 1] - prefix[left];

        System.out.println(sum);
    }
}