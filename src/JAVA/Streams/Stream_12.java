package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
12. Total Length of Unique Words Starting With 'S'
Problem:
Given a list of strings, remove duplicates, filter words starting with 'S', map to their lengths, and
reduce to get the total length.
List<String> words = Arrays.asList("Sun", "Sky", "Sea", "Sand", "Sky", "Sun", "Stone");
// Output: 3 + 3 + 3 + 4 + 5 = 18
 */
public class Stream_12 {
    static void main() {
        List<String> words = Arrays.asList("Sun", "Sky", "Sea", "Sand", "Sky", "Sun", "Stone");
        System.out.println(words.stream().distinct().filter(s->s.startsWith("S")).map(s->s.length()).reduce((a,b)->a+b).get());

    }
}
