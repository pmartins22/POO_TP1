public class Dog extends Animal implements Pet{
    public Dog() {
        this.name = "Dog";
        this.age = 0;
        this.speed = 30.0;
        this.setSecret("im dirty");
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating dog food.");
    }

    @Override
    public void eat(int amount) {
        System.out.println("The dog is eating" + amount + " dog food.");
    }

    public void play() {
        System.out.println("The dog is playing.");
    }
}
