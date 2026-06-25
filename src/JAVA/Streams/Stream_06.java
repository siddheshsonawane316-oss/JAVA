package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
6. Sort a List of Strings Alphabetically
Problem:
Sort a list of strings in alphabetical order using Stream API.
List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Grapes");
// Output: ["Apple", "Banana", "Grapes", "Mango"]
 */
public class Stream_06 {
    static void main() {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Grapes");

        fruits.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
