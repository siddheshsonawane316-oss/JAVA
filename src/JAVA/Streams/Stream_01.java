package JAVA.Streams;
/*
1. Filter Even Numbers
   Problem:
   Given a list of integers, use Stream API to filter out and collect all even numbers.
   List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
// Output: [2, 4, 6]
*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_01 {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> A1= numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println(A1);
    }

}
