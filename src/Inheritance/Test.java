package Inheritance;

public class Test {

    //Program starts with the main method.
    public static void main(String[] args) {

        //catAnimal is an object of Inheritance.Animal class.
        Animal catAnimal = new Animal();
        catAnimal.show("cat");
        catAnimal.eatAll();
        catAnimal.sleep();



        //cowAnimal is an object of Inheritance.Animal class.
        Animal cowAnimal = new Animal();
        cowAnimal.eatVeg();
        cowAnimal.sleep();

        //owlBirds is an object of Inheritance.Birds class.
        Birds owlBirds = new Birds();

        // Here eatAll() and sleep() methods are inherited from Inheritance.Animal class.
        owlBirds.show("Owl");
        owlBirds.canFly();
        owlBirds.eatAll();
        owlBirds.sleep();


        //Examples of method overloading.
        cowAnimal.show("cow");
        catAnimal.show();

        //Examples of method Overriding
        catAnimal.show();
        owlBirds.show();
    }
}
