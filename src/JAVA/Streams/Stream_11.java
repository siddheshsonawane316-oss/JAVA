package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
11. Find the Product of All Even Numbers Greater Than 10
Problem:
Given a list of integers, filter the numbers that are even and greater than 10, then find their
product.
List<Integer> nums = Arrays.asList(5, 12, 18, 7, 22, 3);
// Steps: filter (even && >10) → map (identity) → reduce (product)
// Output: 12 * 18 * 22 = 4752
 */
public class Stream_11 {
    static void main() {
        List<Integer> nums = Arrays.asList(5, 12, 18, 7, 22, 3);
        int result=nums.stream().filter(n-> n%2==0 && n>10).map(n->n).reduce((a,b)->a*b).get();
        System.out.println(result);
    }
}
