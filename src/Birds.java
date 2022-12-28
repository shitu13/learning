public class Birds extends Animal{
    //canFly() is a method.
    public void canFly() {
        System.out.println("I am a Bird & I can fly.");
    }


    @Override
    void show() {
        System.out.println("I am method of Bird class.");
    }
}
