package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
8. Remove Duplicates
Problem:
Remove duplicate elements from a list of integers using Stream API.
List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
// Output: [1, 2, 3, 4, 5]
 */
public class Stream_08 {
    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        numbers.stream().
                distinct()
                .forEach(System.out::println);
    }
}
