package JAVA.Arrays;

import java.util.HashMap;
/*
Optimal Approach
1. Use HashMap to store frequencies of seen elements.
2. For each element, calculate required number (k - element).
3. If required number already exists, add its frequency to answer.
4. Store current element in HashMap.
5. Return total count.
        */
public class TwoSumCount {
    static void main() {
        int arr[] = {1, 1, 4};
        int k = 5;
        int count = 0;

        HashMap<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num=k-arr[i];
            if(elements.containsKey(num)){
                count+=elements.get(num);
            }

            elements.put(arr[i],elements.getOrDefault(arr[i],0)+1);
        }

        System.out.println(count);
    }
}