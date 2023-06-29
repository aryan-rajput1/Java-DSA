// In this program we created a calss called pen and a public class called first to demopnstrate the use of OOps in Java. 
// We created a object of the class called pen and a object of the class called first, 
// and invoke the properties of the object pen into our main class
// we also implemented copy constructor and copied the object of the class first into the object of the class pen.
class pen {
    String color;
    int width;
    String type;
    public void printtype() {
        System.out.println(this.color);
        System.out.println(this.width);
        System.out.println(this.type);
    }

    public pen(String color, int width, String type) {
        this.color = color;
        this.width = width;
        this.type = type;
    }

    public void write() {
        System.out.println("writing...");
    }
    pen(pen p3) {
        this.color = p3.color;
        this.width = p3.width;
        this.type = p3.type;
    }
}

public class first {
    public static void main(String[] args) {
        pen p1 = new pen("red", 2, "ball");
        pen p2 = new pen("black", 5, "gel");
        System.out.print(p1.color + " " + p1.width + " " + p1.type);
        System.out.println("");
        System.out.println(p2.color + " " + p2.width + " " + p2.type);
        p1.printtype();
        p2.printtype();
        pen p3 =  new pen(p1);
        p3.printtype();
        pen p4 = new pen(p2);
        p4.write();
    }
}