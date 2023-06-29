import java.util.*;
public class Taskup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players : ");
        int a = sc.nextInt();
        int[] array = new int[a];  
        
        String name;
        System.out.println("assign the numbers of each player: ");  
         for(int i=0; i<a; i++)  
        {  
        //reading array elements from the user
        System.out.print("Enter name of player"+i+":");
         name = sc.next();  
        
        System.out.print("Enter assigned number :") ;
        array[i]=sc.nextInt();  
        }  
        System.out.print("Host may enter the sentence : ");
        String str = sc.next();
        int l = str.trim().length();
        System.out.print("THE NUMBER IS :"+ l);
    }
}
