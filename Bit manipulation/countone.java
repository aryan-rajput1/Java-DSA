public class countone {
    public static void main(String[] args) {
      int a = 7;
int count = 0;

String str = Integer.toBinaryString(a);
for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == '1') {
        count++;
    }
}

System.out.println("Number of ones in binary representation of " + a + " is " + count);

    }
}
