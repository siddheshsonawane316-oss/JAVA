package JAVA.Strings;

public class IsSubsequence {
    static void main() {
        String s = "abc";
        String t = "ahbgdc";

        int j = 0; // Pointer for string s

        // Traverse string t
        for (int i = 0; i < t.length(); i++) {

            // If characters match, move the pointer in s
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }

        // If all characters of s have been matched,
        // then s is a subsequence of t
        if (j == s.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}