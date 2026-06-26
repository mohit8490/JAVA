

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


interface Vehicle{
    void start();
    void accelerate();
    void brake();
}

class Bike implements Vehicle{

    public void start(){
        System.out.print("Bike Started");
    }
    public void accelerate(){
        System.out.print("Bike accelerate");
    }
    public void brake(){
        System.out.print("Bike stop");
    }
}


class Car implements Vehicle{

    public void start(){
        System.out.print("Car Started");
    }
    public void accelerate(){
        System.out.print("Car accelerate");
    }
    public void brake(){
        System.out.print("Car stop");
    }
}