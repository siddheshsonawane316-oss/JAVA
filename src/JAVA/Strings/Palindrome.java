package JAVA.Strings;

public class Palindrome {
    static void main(String[] args) {
        String s1="A man, a plan, a canal: Panama!";

        //Replaces everything else other than [^a-zA-z0-9]  with ""  eg., ;
        String temp=s1.replaceAll("[^a-zA-z0-9]","");

        //Iniate l at start and r at last index
        int l=0;
        int r=temp.length()-1;

        while(l<r){
            //if l!=r
            if(Character.toLowerCase(temp.charAt(l))!=Character.toLowerCase(temp.charAt(r))){
                System.out.println("Not Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("String is Palindrome");
    }
}
