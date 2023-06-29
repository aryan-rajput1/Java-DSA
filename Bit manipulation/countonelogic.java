public class countonelogic {
   public static void main(String[] args){
    int a  = 7;
    int n = a;
    int count = 0;
    while(a>0){
          a = a & (a-1);
          count++;
    }
    System.out.println("Number of ones in binary representation of " + n + " is " + count);
}
}
