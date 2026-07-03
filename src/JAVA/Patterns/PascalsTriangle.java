package JAVA.Patterns;

public class PascalsTriangle {
    static void main() {
        // 2D array to store Pascal's Triangle values
        int arr[][]=new int[5][5];

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <=i; j++) {

                // First and last element of every row is always 1
                if(j==0 || j==i){
                    arr[i][j]=1;
                }
                else{

                    // Middle elements are the sum of the two elements
                    // directly above them from the previous row
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
