package Inheritance;

public class Animal {
        //Here Inheritance.Animal is the class and eatAll, sleep, eatVeg these three are methods.

        //eatAll is a method.
        public void eatAll() {
            System.out.println("I eat veg and nonveg.");
        }

        //sleep is a method.
        public void sleep() {
            System.out.println("I am sleeping.");
        }

        //eatVeg is a method.
        public void eatVeg() {
            System.out.println("I only eat veg and I don't eat nonveg.");
        }


        void show() {
            System.out.println("I am a method of Inheritance.Animal class.");
        }

        void show(String str) {
            System.out.println("I am a " + str);
        }
    }
