package JAVA.Arrays.Basics;

import java.util.HashMap;

public class SubarraysWithKDistinct {
    public static  int atmost(int nums[],int k){
     int count=0;
     int r=0;
     int l=0;
     HashMap <Integer,Integer> h1=new HashMap<>();
     for (; r < nums.length ; r++) {
        h1.put(nums[r],h1.getOrDefault(nums[r],0)+1);
        while(h1.size()>k){
            h1.put(nums[l],h1.get(nums[l])-1);
            if(h1.get(nums[l])==0){
                h1.remove(nums[l]);
            }
            l++;
        }
        count+=r-l+1;
     }
    return count;
    }
    static void main() {
        int nums []= {1,2,1,2,3}; int k = 2;
        int res=atmost(nums,k)-atmost(nums,k-1);
        System.out.println(res);
    }
}
