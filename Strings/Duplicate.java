
public class Duplicate
{
    static final int charNo=256;
static void charcount(String str, int[] count)
{
for(int i =0;i<str.length();i++)
{
    count[str.charAt(i)]++;
}
}
static void printdups(String str)
{
    int[] count = new int[charNo];
    charcount(str,count);
    for(int i =0;i<charNo;i++)
    {
      if(count[i]>1){
        System.out.println((char)(i)+count[i]);
      }
    }
}
public static void main(String[] args)
{
    String str = "testt";
    printdups(str);
}

}