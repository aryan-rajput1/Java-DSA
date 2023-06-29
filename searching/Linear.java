import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
       System.out.println("Enter size of array");
       int n = sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter array elements:");
        for(int i =0; i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        s = sc.nextInt();
        sc.close();
        for(int i = 0;i<=n-1;i++){
            if(arr[i]==s){
                System.out.println("Element found at index : "+i);           
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }
    }
}
