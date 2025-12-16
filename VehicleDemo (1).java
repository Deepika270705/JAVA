abstract class Vehicle {
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}

class car extends Vehicle{
    private double distance,displacement;
    private int time;

    car(double distance,double displacement,int time) {
        this.distance = distance;
        this.displacement = displacement;
        this.time = time;
    }

    double calculateSpeed() {
        return (distance/time);
    }

    double calculateVelocity() {
        return (displacement/time);
    }
}

class bike extends Vehicle {
    private double distance,displacement;
    private int time;

    bike(double distance,double displacement,int time) {
        this.distance = distance;
        this.displacement = displacement;
        this.time = time;
    }

    double calculateSpeed() {
        return (distance/time);
    }

    double calculateVelocity() {
        return (displacement/time);
    }
    
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new car(57,23,2);
        Vehicle bike = new bike(60, 35, 3);

        System.out.println("Car Speed: " + car.calculateSpeed());
        System.out.println("Car Velocity: " + car.calculateVelocity());

        System.out.println("Bike Speed: " + bike.calculateSpeed());
        System.out.println("Bike Velocity: " + bike.calculateVelocity());
    }
}