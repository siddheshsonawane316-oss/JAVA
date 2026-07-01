package JAVA.Strings;

public class ToggleAlternateCase {
    static void main() {
     StringBuilder str=new StringBuilder("SSsjSJsS");
     for (int i=0;i<str.length();i++){
         if(i%2==0){
             str.setCharAt(i,Character.toUpperCase(str.charAt(i)));
         }else{
             str.setCharAt(i,Character.toLowerCase(str.charAt(i)));
         }

     }
        System.out.println(str);
    }
}
