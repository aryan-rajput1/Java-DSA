// print the blow pattern
/* 
 1
 * *
 1 2 3
 * * * *
 1 2 3 4 5
 */
public class numstar {
    public static void main(String[] args) {
        int i=1;
        while(i<=5) {
            int j=1;
            while(j<=i) {
                if(i%2==0) {
                    System.out.print("* ");
                } else {
                    System.out.print(j + " ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

