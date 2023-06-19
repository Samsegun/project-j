package Oop;

public class Main {

    public static void main(String[] args) {

//        Car toyota = new Car("toyota", "camry", "blue", 4, false);
//        Car benz = new Car("benz", "amg", "black", 4, true);

        Car car1 = new Car();
        car1.setConvertible(true);
        car1.setColor("green");
        car1.setMake("benz");
        car1.setDoors(4);
        car1.setModel("X");

        car1.describeCar();


    }
}
