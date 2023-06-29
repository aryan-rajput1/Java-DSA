public class Inherit {
    int a = 10;

    public void printA() {
        System.out.println(a);
    }
}

class myclass {
    public static void main(String[] args) {
        Inherit i = new Inherit();
        i.printA();
    }
}
