public class Cow extends Animal {
    public Cow() {
        this.name = "Cow";
        this.age = 0;
    }
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }

    @Override
    public void eat() {
        System.out.println("The cow is eating grass.");
    }

    @Override
    public void eat(int amount) {
        System.out.println("The cow is eating" + amount + " grass.");
    }
}