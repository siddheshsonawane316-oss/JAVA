package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
Problem:
Use Stream API to find the maximum number in a list of integers.
List<Integer> nums = Arrays.asList(23, 5, 89, 16, 45);
// Output: 89
 */
public class Stream_05 {
    static void main() {
        List<Integer> nums = Arrays.asList(23, 5, 89, 16, 45);
        System.out.println(
                nums.stream()
                        .max((a,b)-> a.compareTo(b))
                        .get()
        );
    }
}
