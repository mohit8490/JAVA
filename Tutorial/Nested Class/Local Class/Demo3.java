// Local classes

public class Demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

// Effective final variable

class Outer {
    void greet() {
        int y = 5;   // it is a effective variable it means the variable that is not a final type but it cannot be reinitialized.
        // y++;  we can't change effective final variable

        class Local {
            void sayHello() {
                System.out.println(y);
            }
        }

        Local local  = new Local();
        local.sayHello();
    }
}

/*
Contructor
Method
If
Loop
Static block
*/