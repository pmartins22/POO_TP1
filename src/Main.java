public class Main {
    public static void main(String[] args) {
        // etape 1
        Cow cow = new Cow();
        cow.makeSound();

        // etape 2
        Animal.printDescription();
        //Animal animal = new Animal();
        //animal.makeSound();

        // etape 3
        Dog dog = new Dog();
        dog.eat();
        cow.eat();
        // cow.eat(); and dog.eat(); are different implementations of the abstract method eat() from the Animal class.

        // etape 4

        dog.eat();
        dog.eat(5);

        // etape 5

        System.out.println(dog.speed); // public attribute is accessible globally
        // System.out.println(dog.name); // protected attribute is not accessible here
        // System.out.println(dog.secret); // private attribute is not accessible here

        // accessing private and protected attributes via public getter method
        System.out.println(dog.getName());
        System.out.println(dog.getSecret());

        // etape 6

        dog.play();
    }
}