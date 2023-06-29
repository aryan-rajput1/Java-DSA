import java.io.*;
import java.util.*;
public class Roatation {
Static boolean compare(String s1, String s2)
{
    if(s1.equals(s2))
    {
    return true;
    }
    else{
        return false;
    }
    return true;
}
static int rotation(String s1,String s2,int index,int n1)
{
    
}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter both strings:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1!=n2)
        {
            System.out.println("not rotation");
        }
        else if(s1.equals(s2))
        {
            System.out.println("Not rotation instead same");
        }
        else 
        {
            for(int i = 0;i<n1;i++)
            {

            }
        }
    }
}

