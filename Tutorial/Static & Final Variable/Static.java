

public class Static {
    public static void main(String[] args){

        Student s1 = new Student("Mohit",21,1196);

        // s1.college = "IIT Indore";
        // orr
        Student.college = "IIT Indore";

        // s1.abc();
        // orr
        Student.abc();


        s1.details();
        
    }
    
}

class Student{

    // instance variable
    String name;
    int age;
    int rollNo;
    

    // static variable
    static String college;
    static String city;

    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        // this.college = college;   we can't do this with college and city bcoz college and city are  static variable.
        // this.city = city;
    }


    // static block
    // use to do some only with static variable.
    // here we use static block to initialize the static variable
    static{
       city = "Indore";
    }


    // static method (use only college variable bcoz college is also static variable)
    static void abc(){

        // we can't do these with name,age,rollNum bcoz method is static and static method only access static variable.
        // System.out.println("College name = "+name);
        // System.out.println("College name = "+age);
        // System.out.println("College name = "+rollNo);
        System.out.println("College name = "+college);
        System.out.println("City name = "+city);
    }


    void details(){
        System.out.println("name = "+name);
        System.out.println("age = "+age);
        System.out.println("roll Num = "+rollNo);
    }
}
