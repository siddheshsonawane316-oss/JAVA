package JAVA.Strings;



public class SwapFirstandLastWord {
    static void main() {
  StringBuilder str=new StringBuilder("this is the new java String");
  String FirstWord=str.substring(0,str.indexOf(" "));
  String LastWord=str.substring(str.lastIndexOf(" ")+1,str.length());
    str.replace(0,str.indexOf(" "),LastWord);
    str.replace(str.lastIndexOf(" ")+1,str.length(),FirstWord);
        System.out.println(str);
    }
}
