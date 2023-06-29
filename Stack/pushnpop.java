import java.util.*;
public class pushnpop{

    public void pushq(Stack<Integer> s){
        for(int i=0;i<10;i++){
            s.push(i);
        }
    }
    public void popq(Stack<Integer> s){
        for(int i=0;i<6;i++){
            s.pop();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        pushnpop obj=new pushnpop();
        obj.pushq(s);
        obj.popq(s);
        System.out.println(s);
        sc.close();
    }
}