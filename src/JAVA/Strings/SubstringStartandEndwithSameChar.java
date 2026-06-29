package JAVA.Strings;

import java.util.HashMap;
import java.util.Map;

//Count how many substrings start and end with the same character (simple logic).
public class SubstringStartandEndwithSameChar {
    static void main() {
    String str="abcaab";
    int count=0;

    //Starting Index
    for(int i=0;i<str.length();i++){

        //Pick Every Possible Index i onwards
        for (int j=i;j<str.length();j++) {

            // Check if the substring starts and ends
            // with the same character
            if(str.charAt(i)==str.charAt(j)) {
                     count++;

            }
            }
    }
        System.out.println(count);
    }
}