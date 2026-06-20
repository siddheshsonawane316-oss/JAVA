package JAVA.Arrays.Basics;

public class RotateLeftBy1 {
    static void main() {
        int  []arr={1,2,3,4};
        int temp=arr[0];
        for (int i=0;i< arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        for (int n:arr){
            System.out.println(n);
        }
    }
}
