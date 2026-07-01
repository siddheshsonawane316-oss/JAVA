package JAVA.Strings;

public class RemoveDuplicates {
    static void main() {
        String str="aabbsfg";
        // Stores the result after removing duplicate characters
        String res="";


        // Traverse each character of the string
        for(int i=0;i<str.length();i++){

            // Check if the current character is already present in 'res'
            // indexOf() returns -1 if the character is not found
            if(res.indexOf(str.charAt(i))==-1){

                // Character is not present, so append it to the result
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }

}
