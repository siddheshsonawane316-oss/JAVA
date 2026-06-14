package JAVA.Practice;

public class practice{
     static void main(String[] args) {
       Operaation2 Addition=(a, b) -> a+b;
       Operaation2 Substraction=(a, b) -> a-b;

        System.out.println(Addition.operate(5,10));
         System.out.println(Substraction.operate(5,10));
         System.out.println("********************");
    }



}