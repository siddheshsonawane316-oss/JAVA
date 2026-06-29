package JAVA.Strings;

public class ReverseOnlyChar {
    static void main() {
        StringBuffer str=new StringBuffer("2025code");
        int l=0;
        int r=str.length()-1;
        while(l<r){
            if(Character.isDigit(str.charAt(l)) || Character.isDigit(str.charAt(r))){
                if(Character.isDigit(str.charAt(l)) && Character.isDigit(str.charAt(r))){
                    l++;
                    r--;
                }
                else if(Character.isDigit(str.charAt(l))) {
                    l++;
                }
                else if(Character.isDigit(str.charAt(r))) {
                    r--;

                }
                }
            else{
                char temp=str.charAt(l);
                str.setCharAt(l,str.charAt(r));
                str.setCharAt(r,temp);
                r--;
                l++;

            }
        }
        System.out.println(str);


    }

}
