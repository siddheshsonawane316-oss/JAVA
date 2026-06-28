package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
14. Sum of Squares of Odd Numbers from Nested Lists
Problem:
Given a list of lists of integers, flatten them, filter odd numbers, square them, and find the total
sum.
List<List<Integer>> data = Arrays.asList(
Arrays.asList(1, 2, 3),
Arrays.asList(4, 5),
Arrays.asList(6, 7)
);
// Output: 1^2 + 3^2 + 5^2 + 7^2 = 1 + 9 + 25 + 49 = 84
 */
public class Stream_14 {
    static void main() {
        List<List<Integer>> data = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7)
        );

    int sum=data.stream().flatMap(List->List.stream()).filter(n->(n%2)!=0).mapToInt(n->n*n).sum();
        System.out.println(sum);
    }
}
