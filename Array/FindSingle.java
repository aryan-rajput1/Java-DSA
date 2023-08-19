import java.util.*;
public class FindSingle {
    public static int getSingleElement(int []arr){
        // Write your code here.
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            ans ^= arr[i];
        }
        return ans;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements of array");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("the element that exist only once is : " + getSingleElement(arr));
            sc.close();
        }
}
