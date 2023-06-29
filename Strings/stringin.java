import java.util.*;

public class stringin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your first name:");
        String fname = sc.next();
        System.out.print("enter your last name:");
        String lname = sc.next();
        String fullname = fname+" "+lname;
        System.out.println(fullname);
        int l = fullname.length();
        System.out.println(l);
        sc.close();
}
}
