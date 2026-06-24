package JAVA.Streams;

import java.util.Arrays;
import java.util.List;
/*
4. Count Empty Strings
Problem:
Count the number of empty strings in a list.
List<String> list = Arrays.asList("abc", "", "def", "", "ghi");
// Output: 2
 */
public class Stream_04 {
    static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "", "def", "", "ghi");
        System.out.println(
                list.stream()
                        .filter(s->s.isEmpty())
                        .count()
        );



    }


}
