public class Main {
    public static void main(String[] args) {
        // etape 1
        Cow cow = new Cow();
        cow.makeSound();

        // etape 2
        Animal.printDescription();
        Animal animal = new Animal();
        animal.makeSound();
    }
}