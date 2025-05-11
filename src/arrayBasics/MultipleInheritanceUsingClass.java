package arrayBasics;

/***
 * simple multiple Inheritance
 *
 * interface AnimalEat {
 *    void eat();
 * }
 * interface AnimalTravel {
 *    void travel();
 * }
 * class Animal implements AnimalEat, AnimalTravel {
 *    public void eat() {
 *       System.out.println("Animal is eating");
 *    }
 *    public void travel() {
 *       System.out.println("Animal is travelling");
 *    }
 * }
 * public class Demo {
 *    public static void main(String args[]) {
 *       Animal a = new Animal();
 *       a.eat();
 *       a.travel();
 *    }
 * }
 */

/***
 * Multiple Inheritance in Java is nothing but one class extending more than one class.
 * Previous versions of Java(until JDk 7) doesn’t support Multiple Inheritance because
 * it causes a famous problem called “Diamond Problem“ and hence indirectly Multiple
 * Inheritance in Java is achieved using Interfaces. After the introduction of Default
 * Methods in Java 8, even the interfaces can also have the method bodies.
 *
 * In Java 8 Interface can also have method definition using Default Methods, then
 * obviously it should also result in ambiguity isn’t it ? Yes, but Java 8 can
 * handle this type of compatible issues
 *
 * In Java 8 you cannot implement multiple interfaces having same signature, without
 * explicitly overriding the methods in the child class.
 */
interface Car {
    public default void drive() {
        System.out.println("Car is driving");
    }
}

interface Jeep {
    public default void drive() {
        System.out.println("Jeep is driving");
    }
}

public class MultipleInheritanceUsingClass implements Jeep, Car {

    @Override
    public void drive() {
        System.out.println("Vehicle is driving");

        // or can be done by using super keyword
//        Car.super.drive();
    }

    public static void main(String args[]) {
        MultipleInheritanceUsingClass v = new MultipleInheritanceUsingClass();
        v.drive(); //Output - Vehicle is driving
    }
}
