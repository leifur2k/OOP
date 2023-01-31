package Animals;

public class AnimalFactory {

    public Animal create(String name, boolean wool, int paws, boolean wings, String size) {

        if (wool && paws == 4 && !wings && size.equals("small"))
            return new Hamster(name, wool, paws, wings, size);
        else if (!wool && paws == 0 && !wings && size.equals("small"))
            return new Fish(name, wool, paws, wings, size);
        else if (wool && paws == 4 && !wings && size.equals("big"))
            return new Dog(name, wool, paws, wings, size);
        else if (wool && paws == 2 && wings && size.equals("small"))
            return new Bird(name, wool, paws, wings, size);
        else
            throw new IllegalArgumentException("You cannot create an object with these arguments");

    }

}
