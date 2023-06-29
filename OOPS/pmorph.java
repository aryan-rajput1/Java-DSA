class Student {
    String name;
    int age;
   
    public void displayInfo(String name) {
        System.out.println(name);
    }
 
 
    public void displayInfo(int age) {
        System.out.println(age);
    }
 
 
    public void displayInfo(String name, int age) {
        System.out.println(name+" "+age);
    }
 }
public class pmorph {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sachin";
        s1.age = 23;
        s1.displayInfo("Sachin");
        s1.displayInfo(23);
        s1.displayInfo("Sachin", 23);
    }
} 