



class Student {

    // Types of Constructor in Java

    // 1. default constructor. does not need to create constructor explicitly.  compiler will create default constructor if not created explicitly.
    String name;
    int age;

    // 2. unparameterized constructor.  created explicitly.  can be used to initialize instance variables.
    Student() {
        name = "Mohit";
        age = 18;
    }

    // 3. parameterized constructor.  created explicitly.  can be used to initialize instance variables.
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    
}

public class Main {
    public static void main(String[] args) {

        // 1. default constructor.  compiler will create default constructor if not created explicitly.
        System.out.println("Object Created");

        // 2. unparameterized constructor.  created explicitly.  can be used to initialize instance variables.
        Student s1 = new Student();
        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age);

        // 3. parameterized constructor.  created explicitly.  can be used to initialize instance variables.
        Student s2 = new Student("Rohit", 20);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age);
        
    }
}