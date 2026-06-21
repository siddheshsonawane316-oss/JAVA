package JAVA.Arrays.Basics;

import java.util.HashMap;
import java.util.Map;
//Find elements common bet both Arrays
public class CommonElements {

    static void main() {
       int []arr  = {1, 2, 2, 3};
        int []arr2 = {2, 2, 4};
        int count=0;
        HashMap<Integer,Integer> h1=new HashMap<>();

        //Insert all the Elements from Array 1 into HashMap
        for(int i=0;i<arr.length;i++){
            h1.put(arr[i], h1.getOrDefault(arr[i],0) +1);
        }

        // Traverse second array and check if Hashmap has elements from 1st Array
        for(int i=0;i<arr2.length;i++){
            if(h1.containsKey(arr2[i]) && h1.get(arr2[i])>0){//h1.get(arr2[i])>0 condition to check whether this occurence is new or already checked
                count++;
                // Reduce frequency so the same occurrence
                // cannot be matched again
                h1.put(arr2[i],h1.get(arr2[i])-1);
            }
        }
        System.out.println(count);

    }
}
