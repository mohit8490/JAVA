class Student {

    // Instance Variables.  has default values (null for String, 0 for int.....)
    String name;
    int age;

    // Static Variable.  shared by all objects of the class.  has default value (null for String, 0 for int.....)
    static String college = "ABC College";

    // Method
    void display() {

        // Local Variable   // must be initialized before use.  does not have default value
        int marks = 90;
        
        // int m;
        // System.out.println("Local Variable m = " + m);    Error: variable m might not have been initialized

        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);
        System.out.println("Marks   : " + marks);

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Mohit";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 22;

        s1.display();
        s2.display();

        System.out.println("Accessing Static Variable:");
        System.out.println(Student.college);
    }
}