package JAVA.Arrays;

import java.util.HashMap;
import java.util.Map;

//Compare Two Arrays check if they contain same elements ignore order
public class CompareArrays {
    static void main() {
        int arr[]={2,4,6,22,34,65};
        int arr2[]={6,4,65,2,34,22};

//Insert both in Hashmap Array one increases count Array two decreases count
        HashMap <Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
            h1.put(arr2[i],h1.getOrDefault(arr2[i],0)-1);
        }

//Check if HashMap contains a pair with value greater than zero
        for(Map.Entry<Integer,Integer> m:h1.entrySet()){
            if(m.getValue()!=0){
                System.out.println(m);
                System.out.println("Not Same");
                return;
            }
        }
        System.out.println("Same");
    }
}
