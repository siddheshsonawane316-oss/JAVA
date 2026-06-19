package JAVA.Arrays;

public class second_largest {
    static void main() {
        int []arr={2,45,76,23,89,45};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        System.out.println("Largest: "+max1+ " 2nd Largest: "+max2);
    }
}
