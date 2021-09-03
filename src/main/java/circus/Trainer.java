package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
import circus.animal.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting
        getToSpeak(b);

        /*
         * Note the redundancy check by compiler --> user no needs to worry!
         */
        Animal a = (Animal) b; // upcasting
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

        train(new Duck());
        train(new Parrot());

        //removed to reflect lack of instantiation
        //prevent generic object, attach to something
        //Animal a2 = new Animal();
        //Bird b2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        //modification 1: use underlying object
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("Not a duck! Not a duck!");
        }
    }
}
