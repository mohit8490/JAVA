// Inner class

public class Demo2 {
    public static void main(String[] args) {

        Outer outer = new Outer();
        // not correct bcoz we need to make inner object using outer class object. bcoz it is a normal class not static class
        //Outer.Inner inner = new Outer.Inner();

        Outer.Inner inner =  outer.new Inner();
        // orrrrrrrrrrrrr
       // Outer.Inner inner = new Outer().new Inner();


       // accessimg normal member of inner class
        inner.fun();

        // accessing the static member of inner class
        inner.fun2();
        Outer.Inner.fun2();
    }
}

class Outer {

    int x = 10;

    class Inner {
        //int x = 20;

        //Outer outer;

        static int x = 10;

        void fun() {
            System.out.println(x);
            //System.out.println(Outer.this.x);
        }

        static void fun2() {
            System.out.println("Hello");
        }
    }
}