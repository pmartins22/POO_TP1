public abstract class Animal {
    protected String name;
    protected int age;
    public double speed;
    private String secret;

    public abstract void makeSound();

    public static void printDescription() {
        System.out.println("Animals are multicellular, eukaryotic organisms of the kingdom Animalia.");
    }

    public abstract void eat();
    public abstract void eat(int amount);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSecret(String secret) {
        this.name = secret;
    }

    public String getSecret() {
        return this.secret;
    }
}