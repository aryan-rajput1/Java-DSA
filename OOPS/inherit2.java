class X {
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

class Y extends X {
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class inherit2 {
    public static void main(String[] args) {
        Y obj = new Y();
        obj.setX(10);
        obj.setY(20);

        System.out.println("x = " + obj.getX());
        System.out.println("y = " + obj.getY());
    }
}
