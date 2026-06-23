package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
2. Find the First String Starting with 'A'
Problem:
From a list of strings, find the first string that starts with the letter 'A'.
List<String> names = Arrays.asList("John", "Alice", "Bob", "Alex");
// Output: "Alice"
*/
public class Stream_02 {
    static void main() {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Alex");
        System.out.println(names.stream()
                .filter(n->n.startsWith("A"))
                .findFirst()
                .orElse("Not Found"));
    }
}
