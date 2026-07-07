package JAVA.Strings;
/*
Input
s = "abc de"
Output
edc ba
 */

public class ReverseStringPreservingSpaces {
    static void main() {
        String str="internship at geeks for geeks";
        int l=0;
        int r=str.length()-1;
        String res="";
        while(l<str.length()){

            // If the current position in the original string is a space,
            // preserve the space at the same position in the result.
            if(str.charAt(l)==' '){
                res+=' ';
                l++;
            }

            // If the right pointer is pointing to a space,
            // skip it because spaces should not be reversed.
            else if(str.charAt(r)==' '){
                r--;
            }

            // Both pointers are on characters.
            // Take the character from the right side,
            // append it to the result, and move both pointers.
            else{
                res+=str.charAt(r);
                l++;
                r--;
            }
        }

        System.out.println(res);
    }
}