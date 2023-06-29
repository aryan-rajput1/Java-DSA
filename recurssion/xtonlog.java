// in this the stack height is log(n) and the stack is empty at the beginning.
// in this the stack height is n and the stack is empty at the beginning.
import java.util.*;
public class xtonlog{
    public static int calpow(int n, int x){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(x%2==0){
            return calpow(n/2,x/2)*calpow(n/2,x/2);
        }
        else{
            return calpow(n/2,x/2)*calpow(n/2,x/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pow");
        int n=sc.nextInt();
        System.out.println("Enter the number");
        int x = sc.nextInt();
        calpow(n,x);
        int ans = calpow(n,x);
        System.out.println(ans);
        sc.close();
    }
}
