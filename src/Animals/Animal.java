package Animals;

public abstract class Animal {

    private final String name;
    private final boolean wool;
    private final int paws;
    private final boolean wings;
    private final String size;


    public Animal(String name, boolean wool, int paws, boolean wings, String size) {
        this.name = name;
        this.wool = wool;
        this.paws = paws;
        this.wings = wings;
        this.size = size;
    }

    public abstract String voice();

    public abstract String eatingFood();


    @Override
    public String toString() {
        return "Animal: " + getClass().getSimpleName() + " | Says: " + voice() + " | Eat: " + eatingFood();
    }
}
