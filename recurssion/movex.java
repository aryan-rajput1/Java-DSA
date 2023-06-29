import java.util.*;
public class movex {
    public static void moveallx(String s, int n, int count, String str) {
        if(n==s.length()){
            for(int i=0;i<count;i++){
                str = str + 'x';
            }
            System.out.println(str);
            return;
        }
        char curr = s.charAt(n);
        if(curr=='x' || curr=='X'){
            count++;
            moveallx(s, n+1, count, str);
        }
        else{
             str += curr;
            moveallx(s, n+1, count, str);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string");
    String s = sc.nextLine();
    moveallx(s,0,0, "");
    sc.close();
    }
}
