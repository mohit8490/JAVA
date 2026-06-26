


// use of this keyword to refer current class instance variable

class Student {
    String name ;
    int age;
    int rollNum;
    String college;

    Student(String name, int age, int rollNum, String college) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }

// this.name => this refer to current class instance variable name
// this.age => this refer to current class instance variable age
// this.rollNum => this refer to current class instance variable rollNum
// this.college => this refer to current class instance variable college

}

public class Main2 {
    public static void main(String[] args){

        Student s1 = new Student("Rohit", 20, 101, "ABC College");
        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age + ", Roll Number: " + s1.rollNum + ", College: " + s1.college);

        Student s2 = new Student("Mohit", 21, 102, "XYZ College");
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age + ", Roll Number: " + s2.rollNum + ", College: " + s2.college);

    }
}
