package JAVA.Strings;
//Print the second half of the string in reverse.
public class SecondHalfInReverse {
    static void main() {
        String s1="Engineer";
        StringBuilder reversed=new StringBuilder();

        //Append the First Half
        reversed.append(s1.substring(0,s1.length()/2));

        //Traverse from Last index to half
        for(int i=s1.length()-1;i>=s1.length()/2;i--){
            reversed.append(s1.charAt(i));
        }

        System.out.println(reversed);
    }
}
