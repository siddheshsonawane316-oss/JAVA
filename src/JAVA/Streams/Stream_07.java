package JAVA.Streams;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
7. Group Words by Their Length
Problem:
Group a list of strings by their length.
List<String> words = Arrays.asList("one", "two", "three", "four", "six");
// Output: {3=[one, two, six], 5=[three], 4=[four]}
 */
public class Stream_07 {
    static void main(String[] args) {

        List<String> words = Arrays.asList("one", "two", "three", "four", "six");

        words.stream()
                .collect(Collectors.groupingBy(n->n.length())).forEach((k,v)-> System.out.println(k+" "+v));
    }


}
