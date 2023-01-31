package Animals;

public class Hamster extends Animal{


    public Hamster(String name, boolean wool, int paws, boolean wings, String size) {
        super(name, wool, paws, wings, size);
    }

    @Override
    public String voice() {
        return "Fur-Fur";
    }

    @Override
    public String eatingFood() {
        return "Seed";
    }
}
