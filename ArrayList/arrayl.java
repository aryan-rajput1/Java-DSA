import java.util.*;
public class arrayl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Boolean> list2 = new ArrayList<Boolean>();
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(30);
        // list.remove(1);

        list1.add("abc");
        list1.add("xyz");
        list1.add("pqr");
        list1.remove(0);

        list2.add(true);
        list2.add(false);
        list2.add(true);
        list2.remove(1);

        // int a = list.get(1);
        // System.out.println(a);
        Collections.sort(list);
        System.out.println(list); 


        // System.out.println(list);
        // System.out.println(list1);
        // System.out.println(list2);
}
}