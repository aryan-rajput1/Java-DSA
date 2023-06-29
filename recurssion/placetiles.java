import java.util.*;
public class placetiles {
    public static int place(int n, int m) {
        if(n==m) {
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertical = place(n-m, m);
        int horizontal = place(n-1, m);
        return vertical+horizontal;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        System.out.println(place(n,m));
        sc.close();
    }
}
