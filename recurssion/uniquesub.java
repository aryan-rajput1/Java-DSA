import java.util.*;
public class uniquesub {
    public static void unisub(String s, int n, String str, HashSet<String> set){
        if(n==s.length()){
            if(set.contains(str)){
                return;
            }
            else{
                System.out.println(str);
                set.add(str);
                return;
            }
        }
        unisub(s, n+1, str+s.charAt(n), set);
        unisub(s, n+1, str, set);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string");
        String s = sc.nextLine();
        HashSet<String> set = new HashSet<String>();
        unisub(s,0, "", set);
        sc.close();
    }
}
