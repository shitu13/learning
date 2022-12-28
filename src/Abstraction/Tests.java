package Abstraction;

public class Tests implements I1, I2 {
    //Interface supports multiple inheritance.

    public static void main(String[] args) {

        Tests tests = new Tests();
        tests.show();
        tests.display1();


    }

    @Override
    public void show() {

        System.out.println("This is show method.");

    }

    @Override
    public void display1() {
        // TODO Auto-generated method stub

        System.out.println("This is display1 method.");

    }
}
