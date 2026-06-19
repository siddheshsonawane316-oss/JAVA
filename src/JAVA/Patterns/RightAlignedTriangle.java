package JAVA.Patterns;

public class RightAlignedTriangle {
    static void main() {
 /*
        *
       **
      ***
     ****
   */

      //rows
       for(int i=0;i<5;i++){

        //spaces
        for(int j=5;j>=i;j--){
            System.out.print(" ");
        }//stars
         for(int k=0;k<=i;k++){
             System.out.print("*");
         }
           System.out.println();
       }
    }
}
