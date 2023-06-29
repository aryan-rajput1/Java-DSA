import java.util.*;

public class TwoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m,n,o,p;
        System.out.print("Enter dimensions of first array:");
        m = sc.nextInt(); n = sc.nextInt(); 
        System.out.print("Enter dimensions of second array:");
        o = sc.nextInt(); p = sc.nextInt();
        int A[][] = new int[m][n]; 
        int B[][] = new int[o][p] ;
        int C[][] = new int[n][p];
        
        System.out.println("Enter the elements of first array :");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                A[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter elements of second array:");
        for(int k=0;k<o;k++){
            for(int l=0;l<p;l++){
                B[k][l]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                C[i][j] = A[i][j]+B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}