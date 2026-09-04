package JAVA.Arrays.Basics;

public class LongestTurbulentSubarray {
    static void main() {
        int nums[]={9,4,2,10,7,8,8,1,9};
        int current=0;
        int previous=0;
        int count=1;
        int maxcount=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                current=-1;
            }
            else if(nums[i]<nums[i-1]){
                current=1;
            }
            else{
                current=0;
            }

            if(current==0){
                count=1;
            }
            else if(current==previous){
                count=2;
            }
            else if(current!=previous){
                count++;
            }
            maxcount=Math.max(maxcount,count);
            previous=current;

        }
        System.out.println(maxcount);
    }
}
