import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of student");
        System.out.print("Enter name : ");
        String str = sc.nextLine();
        System.out.println("");
        System.out.print("Enter roll number : ");
        int roll = sc.nextInt();
        System.out.println("");
        System.out.print("Enter class : ");
        int class1 = sc.nextInt();
        System.out.println("");
        System.out.println("Name : "+ str);
        System.out.println("roll number : "+ roll);
        System.out.println("class : "+ class1);
        sc.close();
    }
}
