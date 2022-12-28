package Abstraction;

public interface I1 {

        //This is a public abstract method by default.
        void show();

        //default & static concrete methods are allowed. public/protected/private concrete methods are not allowed.

        default void display2() {
            System.out.println("This is a default concrete method.");
        }

    }

    interface I2{

        void display1();

        default void display() {
            System.out.println("This is a default concrete method.");
        }
    }

