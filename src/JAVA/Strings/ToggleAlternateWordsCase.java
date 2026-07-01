package JAVA.Strings;

public class ToggleAlternateWordsCase {
    static void main() {
        StringBuilder str = new StringBuilder("Hello JAVA is FUN");

        // Marks the starting index of the current word
        int start=0;

        // false -> convert current word to lowercase
        // true  -> convert current word to uppercase
        boolean toggle=false;

        // Traverse the sentence.
        // i <= str.length() is used so that the last word
        // is processed even though there is no space after it.
        for (int i = 0; i <=str.length(); i++) {

            // 'i == str.length()' must be checked first.
            // Due to short-circuit evaluation, Java will not
            // execute str.charAt(i) when i == str.length().
            if(i==str.length() || str.charAt(i)==' '){

                // Ensure the word is not empty
                if(start<i ){
                    if(toggle==false){
                        str.replace(start,i,str.substring(start,i).toLowerCase());
                        toggle=true;
                    }
                    else if(toggle==true){
                        str.replace(start,i,str.substring(start,i).toUpperCase());
                        toggle=false;
                    }
                }
                // Move start to the beginning of the next word
                start=i+1;
            }
        }
        System.out.println(str);
    }
}