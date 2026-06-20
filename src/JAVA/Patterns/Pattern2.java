package JAVA.Patterns;

public class Pattern2 {
    static void main() {
        /*
0
1 0
0 1 0
1 0 1 0
0 1 0 1 0
        */

        int rows=5;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(0+" ");
                }else
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
