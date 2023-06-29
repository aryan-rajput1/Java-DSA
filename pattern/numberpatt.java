public class numberpatt {
    public static void main(String[] args) {
        int s=1;
        int i=1;
        while(i<=5)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(s+" ");
                s++;
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
