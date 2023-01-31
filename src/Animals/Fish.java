package Animals;

public class Fish extends Animal {
    public Fish(String name, boolean wool, int paws, boolean wings, String size) {
        super(name, wool, paws, wings, size);
    }

    @Override
    public String voice() {
        return "Meow-Meow";
    }

    @Override
    public String eatingFood() {
        return "Milk";
    }
}
