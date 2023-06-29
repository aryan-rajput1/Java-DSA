import java.util.*;
public class permutations {
    public static void permut(String s, String str){
        if(s.length()==0){
            System.out.println("->"+str);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String ros = s.substring(0,i)+s.substring(i+1);
            permut(ros,str+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        permut(s,"");
        sc.close();
    }
}
