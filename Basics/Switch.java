import java.util.*;
public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int math,phy,chem,eng,comp,sum,perc;
        System.out.println("Enter marks respectively");
        math = sc.nextInt();
        phy = sc.nextInt();
        chem = sc.nextInt();
        eng = sc.nextInt();
        comp = sc.nextInt();
        sum = math+phy+chem+eng+comp;
        perc = sum/5;
        System.out.println("percentage is :" + perc);
        switch (perc) {
                case 60:
                System.out.println("C grade");
                break;
                case 70:
                System.out.println("B grade");
                break;    
                case 80:
                System.out.println("A grade");
                break;
                case 90:
                System.out.println("A+ grade");
                break;
            default:
                break;
        }
        sc.close();
    }
}