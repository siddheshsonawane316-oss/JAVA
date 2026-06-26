package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
9. Sum of All Odd Numbers
Problem:
Calculate the sum of all odd numbers from a list.
List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
// Output: 9 (1 + 3 + 5)
 */
public class Stream_09 {
    static void main() {
        List<Integer> nums = Arrays.asList( 3, 4, 5,6,7,9);
       int x= nums.stream()
                .filter(n->n%2!=0)
                .mapToInt(m->m)
                .sum();

        System.out.println(x);
    }
}
