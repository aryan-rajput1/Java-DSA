import java.util.*;
public class duplicates {
    public static boolean map[] = new boolean[26];
    public static void dupes(String s, int n, String str){
    if(s.length() == n){
        System.out.println(str);
        return;
    }
        if(map[s.charAt(n)-'a']){
        dupes(s, n+1, str);
    }
    else{
        str+=s.charAt(n);
        map[s.charAt(n)-'a']=true;
        dupes(s, n+1, str);
    }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a string");
        String s = sc.nextLine();
        dupes(s, 0, "");
        sc.close();
    }
}
