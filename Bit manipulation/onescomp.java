public class onescomp {
    public static void main(String[] args) {
        int num = 14;

String binaryString = Integer.toBinaryString(num);
String onesComplement = "";
for (int i = 0; i < binaryString.length(); i++) {
    char c = binaryString.charAt(i);
    if (c == '1') {
        c=0;
    } else {
        c=1;
    }
}

int result = Integer.parseInt(onesComplement, 2);
System.out.println("One's complement of " + num + " is " + result);

    }
}
