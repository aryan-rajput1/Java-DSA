abstract class animals{
    public void eat(){
        System.out.println("eat");
    }
    abstract void sleep();
}
class horse extends animals{
    public void eat(){
        System.out.println("eat with one jabda");
    }
    public void sleep(){
        System.out.println("sleep with legs khade");
    }
}
class cat extends animals{
    public void eat(){
        System.out.println("eat with both jabda");
    }
    public void sleep(){
        System.out.println("sleep with legs lete");
    }
}
public class abstraction {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.eat();
        h1.sleep();

        cat fluffy = new cat();
        fluffy.eat();
    }
}

