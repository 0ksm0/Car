package ua.com.java;

public class CarSterter {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive(5.5f);
        myCar.drive(3);
        myCar.stop();
    }
}
