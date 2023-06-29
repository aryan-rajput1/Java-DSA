class shape{
    public void area() {
        System.out.print("area");
    }
}

class circle extends shape{
    public void area(int r) {
        System.out.println(r*r*3.14);
    }
}
public class inheritance {
    public static void main(String[] args) {
        circle c1 = new circle();
    circle c2 = new circle();
        c1.area(7);
        c2.area(5);
    }
}
