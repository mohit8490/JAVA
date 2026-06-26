

public class Main {
    public static void main(String args[]){

        // for bike
        Vehicle v = new Bike();
        v.start();
        v.accelerate();
        v.brake();

        // orrr
        Bike b = new Bike();
        b.start();
        b.accelerate();
        b.brake();



       // for car
        Vehicle v1 = new Car();
        v1.start();
        v1.accelerate();
        v1.brake();

        // orrr
        Car c = new Car();
        c.start();
        c.accelerate();
        c.brake();

        
    }



    
    
}


abstract class Vehicle{

    abstract void start();

    abstract void accelerate();

    void brake(){
        System.out.println("Vechicle Stop");
    }

}


class Bike extends Vehicle{

    void start(){
        System.out.println("Bike Start");
    }

    void accelerate(){
        System.out.println("Bike accelerate");
    }

}

class Car extends Vehicle{

    void start(){
        System.out.println("Car Start");
    }

    void accelerate(){
        System.out.println("Car accelerate");
    }

}