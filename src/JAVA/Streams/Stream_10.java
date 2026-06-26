package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Problem:
Given a list of strings, use Stream API to count the frequency of each word.
List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
// Output: {apple=2, banana=2, orange=1}
 */
public class Stream_10 {
    static void main() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");

        words.stream().collect(Collectors.groupingBy(s->s,Collectors.counting())).forEach((k,v)-> System.out.println(k+" "+v));

    }
}
