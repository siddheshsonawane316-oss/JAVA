package JAVA.Arrays.Basics;

import java.util.HashSet;
import java.util.Set;

/*
Question:
Print all elements that are present in arr1 but absent in arr2.
Do not print duplicate elements in the output.
*/

public class ElementPresentInOneArray {

    static void main() {

        int[] arr1 = {1, 2, 3, 4, 2, 25};
        int[] arr2 = {2, 3, 4, 2, 2};

        // Stores all elements of arr2
        Set<Integer> ele = new HashSet<>();

        // Stores already printed elements to avoid duplicate output
        Set<Integer> printedEle = new HashSet<>();

        // Insert all elements of arr2 into HashSet
        // so we can quickly check whether an element exists in arr2
        for (int i = 0; i < arr2.length; i++) {
            ele.add(arr2[i]);
        }

        // Traverse arr1
        for (int i : arr1) {

            // Check whether element has already been printed
            boolean printedEleContains = printedEle.contains(i);

            // Check whether element exists in arr2
            boolean eleContains = ele.contains(i);

            // Print only if:
            // 1. Element is not present in arr2
            // 2. Element has not been printed before
            if (eleContains == false && printedEleContains == false) {

                System.out.println(i);

                // Mark element as printed
                printedEle.add(i);
            }
        }
    }
}