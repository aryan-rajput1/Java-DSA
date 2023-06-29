import java.util.*;
public class Namefunction{
    public static void nameprint(String name) {
        System.out.println(name);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        nameprint(name);
    }
}