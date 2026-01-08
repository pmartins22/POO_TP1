public abstract class Animal {
    protected String name;
    protected int age;

    public abstract void makeSound();

    public static void printDescription() {
        System.out.println("Animals are multicellular, eukaryotic organisms of the kingdom Animalia.");
    }

    public abstract void eat();
    public abstract void eat(int amount);
}