import java.util.*;
public class compareto {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first string:");
        String s1 = sc.nextLine();
        System.out.println("enter second string:");
        String s2 = sc.nextLine();
        // s1>s2 it returns a positive value
        // s1<s2 it returns a negative value
        // s1==s2 it returns 0
        // int n = s1.length();
        // int m = s2.length();
        String first = s1.substring(0,2);
        String second = s2.substring(0,2);
        String final1 = first.concat(second);
        System.out.println(final1);
        if(s1.compareTo(s2)>0)
        {
            System.out.println(s1+" is greater than "+s2);
        }
        else if(s1.compareTo(s2)<0)
        {
            System.out.println(s1+" is less than "+s2);
        }
        else
        {
            System.out.println(s1+" is equal to "+s2);
        }
        sc.close();
    }
}
