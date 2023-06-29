class X {
    int a ;
    public void m2(int a ) {
        this.a = a;
        System.out.println("a is:"+a);
    }
}

class Y extends X {
    public void m2(int a) {
        System.out.println("b is :"+a);
    }
}

public class MethodOver {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.m2(10);
    }
}
