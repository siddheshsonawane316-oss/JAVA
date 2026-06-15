package JAVA.Practice;

public class lcm {
    static void main(String[] args) {
        int a=10;
        int b=15;
        int max=Math.max(a,b);
        boolean flag=true;

        /*while(flag){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
            i++;
        }*/

        for (int i=1;i<a*b;i++){
            int prod=max*i;
            if(prod%a==0 && prod%b==0){
                System.out.println(prod);
                break;
            }
        }
    }
}
