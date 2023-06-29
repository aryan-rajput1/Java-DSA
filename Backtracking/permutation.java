public class permutation {
    public static void permut(String str, String ans) {
        // int count=0;
        if (str.length() == 0) {
            System.out.println(ans+" ");
            return;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            // count++;
            permut(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        permut("abcd", "");
    }
}

