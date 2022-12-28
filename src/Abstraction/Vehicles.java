package Abstraction;

public abstract class Vehicles {
        abstract void start();

        public static void main(String[] args) {


            // Abstraction.Vehicles vehicles = new Abstraction.Vehicles();
            // Can't create object of an abstract class.

            Car toyotaCar = new Car();
            toyotaCar.start();

            Bike gixerBike = new Bike();
            gixerBike.start();
        }

    }

    class Car extends Vehicles{

        //Unimplemented methods should be implemented.
        @Override
        void start() {
            System.out.println("Abstraction.Car starts with key!");

        }
    }

    class Bike extends Vehicles{

        //Unimplemented methods should be implemented.
        @Override
        void start() {
            System.out.println("Abstraction.Bike starts with a kick!");

        }

}

