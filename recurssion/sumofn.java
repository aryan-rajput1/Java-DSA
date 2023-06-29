import java.util.*;
public class sumofn {
    public static void sumn(int i, int n, int sum){
        if(i==n){
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        sumn(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i =0;
        sumn(i,n,sum);
        sc.close();
    }
}