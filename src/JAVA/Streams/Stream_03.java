package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
3. Convert Strings to Uppercase
Problem:
Given a list of lowercase strings, convert them to uppercase using Stream API.
List<String> words = Arrays.asList("apple", "banana", "cherry");
// Output: ["APPLE", "BANANA", "CHERRY"]
 */


public class Stream_03 {
    static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        System.out.println(words.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList())

        );
    }
}
