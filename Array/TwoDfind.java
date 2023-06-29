import java.util.*;
public class TwoDfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n,num;
        System.out.println("Enter dimensions of array:");
        m = sc.nextInt(); n = sc.nextInt(); 
        int A[][] = new int[m][n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<=m-1;i++){
            for(int j=0;j<=n-1;j++){
                A[i][j]= sc.nextInt();   
            }
        }
        System.out.print("Enter number you want to find:");
        num = sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==num){
                    System.out.println("number found at" + " " + i + " " + j);
                    continue;
                }
                else{
                    continue;
                }
            }
        }
        sc.close();
}
}
