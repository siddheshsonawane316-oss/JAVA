package JAVA.Arrays.Basics;

public class MoveZeroes {
    static void main(String[] args) {
        int arr[]={0,1,12,0};

        // 'l' points to the next position where a non-zero element should be placed
        int l=0;

        // 'r' scans every element of the array
        for (int r = 0; r < arr.length; r++) {

            // If the current element is non-zero,
            // move it to the front of the array.
            if(arr[r]!=0){

                // Swap the current non-zero element
                // with the element at index 'l'
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;

                // Move 'l' to the next position
                // where the next non-zero element should be placed
                l++;
            }
        }
    for(int i:arr){
        System.out.println(i);
    }
    }
}
