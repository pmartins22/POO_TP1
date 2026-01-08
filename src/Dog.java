public class Dog extends Animal {
    public Dog() {
        this.name = "Dog";
        this.age = 0;
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
}
