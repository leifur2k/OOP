package Animals;

public class Bird extends Animal {
    public Bird(String name, boolean wool, int paws, boolean wings, String size) {
        super(name, wool, paws, wings, size);
    }

    @Override
    public String voice() {
        return "Chirk-Chirk";
    }

    @Override
    public String eatingFood() {
        return "Worm";
    }
}
