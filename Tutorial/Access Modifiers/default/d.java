// import college.Student;
// import school.Student;

// import college.*;
// import school.*;

//import packageName.className

public class d {
    public static void main(String[] args) {
        college.Student s1 = new college.Student();
        s1.print();

        school.Student s2 = new school.Student();
        s2.print();

        // for this we must make method or variable public.




        // orr -----------------------------------
        // Student s1 = new college.Student();
        // s1.print();

        // Student s2 = new school.Student();
        // s2.print();


        // but if we do this then which Student class called (College/ School) the compiler will confused.
        // so we can't use this type of code
        // but we can do these type with individual. ya to college Student ya to phir school student
    }
}