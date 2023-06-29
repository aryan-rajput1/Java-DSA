import java.util.Scanner;
public class mazemove {
    public static int maze(int i,int j, int n, int m) {
        if(i==n || j==m) {
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int down = maze(i+1, j, n, m);

        int right = maze(i, j+1, n, m);

        int count = down +right;
        
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        System.out.println(maze(0,0,n,m));
        sc.close();
    }
}
