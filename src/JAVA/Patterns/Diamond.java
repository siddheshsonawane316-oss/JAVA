package JAVA.Patterns;

public class Diamond {
    static void main() {
    /*

       *
      ***
     *****
    *******
   *********
    *******
     *****
      ***
       *
        */
        int rows=10;
        for(int i=1;i<=rows/2;i++){
            for(int s=rows/2;s>i;s--){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int l=(rows/2)-1;l>0;l--){
            for (int m=(rows/2)-1;m>=l;m--){
                System.out.print(" ");
            }
            for (int n=1;n<=2*l-1;n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
