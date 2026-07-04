package JAVA.Strings;

public class ReverseWordsInaSentence {
    static void main() {
        StringBuilder str=new StringBuilder("HI java lang is fun");
        int start=0;

        // Traverse the sentence
        for (int i = 0; i <= str.length(); i++) {

            // Word ends at a space or at the end of the string
            if (i==str.length() || str.charAt(i)==' ') {
                if (start < i) {
                    // Reverse the current word in place
                    int l=start;
                    int r=i-1;
                    // Move to the next word
                    while(l<r){
                        char tempChar=str.charAt(l);
                        str.setCharAt(l,str.charAt(r));
                        str.setCharAt(r,tempChar);
                        l++;
                        r--;
                    }
                //str.replace(start,i,String.valueOf(temp));
                }
            start=i+1;
            }
        }
        System.out.println(str);
    }
}
