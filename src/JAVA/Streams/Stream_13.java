package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
Problem:
Given a list of names, filter those longer than 3 characters, capitalize the first letter of each, and
reduce to a single comma-separated string.
List<String> names = Arrays.asList("john", "al", "mark", "susan", "zoe");
// Output: "John,Mark,Susan"
 */
public class Stream_13 {
    static void main() {
        List<String> names = Arrays.asList("john", "al", "mark", "susan", "zoe");
        String s1=names.stream().filter(s->s.length()>3).map(s->s.substring(0,1).toUpperCase()+s.substring(1)).collect(Collectors.joining(","));
        System.out.println(s1);
    }
}
