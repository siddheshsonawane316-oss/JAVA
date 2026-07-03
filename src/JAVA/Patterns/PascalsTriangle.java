package JAVA.Patterns;
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
 */
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
