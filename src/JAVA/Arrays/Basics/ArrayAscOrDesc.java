package JAVA.Arrays.Basics;

public class ArrayAscOrDesc {
    static void main() {
        int arr[]={};
        boolean asc=true;
        boolean desc=true;

        // Compare each element with the next element.
        // We stop at arr.length - 1 because we access arr[i + 1].
        for (int i = 0; i < arr.length-1; i++) {

            // If the current element is greater than the next,
            // the array cannot be in ascending order.
            if(arr[i]>arr[i+1]){
                asc=false;
            }

            // If the current element is smaller than the next,
            // the array cannot be in descending order.
            if(arr[i]<arr[i+1]){
                desc=false;
            }
        }

        // If both flags are true, all elements are equal
        // (or the array has 0 or 1 element), so it is both
        // ascending and descending.
        if (asc && desc) {
            System.out.println("Sorted");
        }
    else if(asc){
            System.out.println("ascending");
        }
    else if (desc){
        System.out.println("descending");
    }
    else{
        System.out.println("Not asc nor desc");
    }
    }
}
