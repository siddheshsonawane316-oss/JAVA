package JAVA.Strings;

public class RemoveDuplicateWords {
    static void main() {
        String str="HI java HI this java is fun";

        // Marks the starting index of the current word
        int start=0;

        // Starts with a leading space so every stored word
        // is surrounded by spaces. This helps avoid matching
        // substrings (e.g., "java" inside "javascript").
        String res=" ";

        // Traverse the entire sentence.
        // i <= str.length() ensures the last word is processed.
        for (int i = 0; i <= str.length() ; i++) {

            // A word ends when we reach a space
            // or the end of the string.
            if( i==str.length() || str.charAt(i)==' '){
                if (start<i ){

                    // Extract the current word
                    String s1=str.substring(start,i);

                    // Check if the complete word is already present.
                    // Spaces before and after the word ensure that
                    // only whole words are matched.
                    if( res.indexOf(" "+s1+" ")==-1){
                       res+=s1+" ";
                   }

                }
            start=i+1;
            }

        }
        System.out.println(res.trim());
    }
}
