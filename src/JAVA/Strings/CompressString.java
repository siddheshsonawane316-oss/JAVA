package JAVA.Strings;

public class CompressString {
    static void main(String[] args) {
        String s="aaabbcdd";
        String s1="";
        int count=1;
        for (int i=1;i<=s.length();i++) {
            if (i<s.length() && s.charAt(i)==s.charAt(i-1)){
            count++;
        }
            else {
                s1+=s.charAt(i-1);
                s1+=count;
                count=1;
            }
        }
        System.out.println(s1);
    }
}
