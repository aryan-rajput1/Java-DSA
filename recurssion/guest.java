import java.util.*;
public class guest {
    public static int guestin(int n) {
        if(n<=1){
            return 1;
        }
        int count = guestin(n-1);
        int count1 = (n-1) * guestin(n-2);
        return count+count1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of guest");
        int n=sc.nextInt();
        System.out.println(guestin(n));
        sc.close();
    }
        
}
