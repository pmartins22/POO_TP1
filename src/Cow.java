public class Cow extends Animal {
    public Cow() {
        this.name = "Cow";
        this.age = 0;
    }
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}