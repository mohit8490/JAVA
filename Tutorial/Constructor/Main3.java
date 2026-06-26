

//=================================================================================
// Chaining of constructor :-  One constructor calls another constructor. in his
// 1st we do constructor overloading
// 2nd we use one constructor using another constructor
// ============================================================================


class Person{
    Person(){
        System.out.println("Parent Constructor");
    }
}

class Student extends Person{

    String name;
    int age;
    int rollNum;
    String college;

// =========================================================================== 
    // using this keyword :-  always must be 1st statement of that constructor.   in this
    // One constructor calls another constructor in the same class.
// ================================================================================


    // here it has no parameter, but we can print all these features because we use last constructor which has 4 parameter using this keyword.
    // Student() {  
    //     this("Mohit", 18, 102, "IIST"); // calling parameterized constructor
    // }

    // here it has only 1 parameter, but we can print all these features because we use last constructor which has 4 parameter using this keyword. 
    Student(String name) {
        this(name, 19, 102, "Bansal"); // calling parameterized constructor
    }

    // here it has only 2 parameter, but we can print all these features because we use last constructor which has 4 parameter using this keyword.
    Student(String name, int age) {
        this(name, age, 103, "acropolis"); // calling parameterized constructor
    }

    // here it has only 3 parameter, but we can print all these features because we use last constructor which has 4 parameter using this keyword.
    Student(String name, int age, int rollNum){
        this(name, age, rollNum, "medicaps"); // calling parameterized constructor
    }

    // here it has all 4 parameter and we also use these parameter ,no any extra parameter so we don't need to calling parents constuctor
    // here we use this keyword to represent the current class instance variable.
    Student(String name, int age, int rollNum, String college) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.college = college;
    }


    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("RollNum : " + rollNum);
        System.out.println("College : " + college);
        System.out.println();
    }


// ===========================================================================
//  using super keyword :-  always must be 1st statement of that constructor.  in this
// constructor form child class can calls constructor from base class.
// ================================================================================



    Student(){
        super(); // calling person class constructor
        System.out.println("Student Constructor");
    }








}



public class Main3 {
    public static void main(String[] args) {
        // Constructor Chaining in Java


// using this keyword :----------------------------
        // System.out.println("1st Constructor");
        // Student s1 = new Student();  // calling 5th constructor
        // s1.display();                   
        // o/p
        // name : mohit
        // age : 19
        // roll Num : 102
        // college : IIST

        System.out.println("2nd Constructor");
        Student s2 = new Student("Rohit");   // calling 5th constructor
        s2.display();
        // o/p
        // name : Rohit
        // age : 19
        // roll num : 102
        // college : Bansal

        System.out.println("3rd Constructor");
        Student s3 = new Student("Mohit", 20);   // calling 5th constructor
        s3.display();
        // o/p
        // name : Mohit
        // age : 20
        // roll num : 103
        // college : acropolis

        System.out.println("4th Constructor");
        Student s4 = new Student("Rohit", 21, 104);   // calling 5th constructor
        s4.display();
        // o/p
        // name : rohit
        // age = 21
        // roll num : 104
        // college : medicaps

        System.out.println("5th Constructor");
        Student s5 = new Student("Mohit", 22, 102, "Prestige");
        s5.display();
        // o/p
        // name : Mohit
        // age : 22
        // roll num : 105
        // college : prestige




// using super keyword :--------------------
        Student s1 = new Student();
        // o/p
        // Person constructor
        // Student Constructor


    }
    
}
