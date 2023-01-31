package Animals;

public class Dog extends Animal{


    public Dog(String name, boolean wool, int paws, boolean wings, String size) {
        super(name, wool, paws, wings, size);
    }

    @Override
    public String voice() {
        return "Wof-Wof";
    }

    @Override
    public String eatingFood() {
        return "Bone";
    }
}
