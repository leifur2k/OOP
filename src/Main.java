import Animals.Animal;
import Animals.AnimalFactory;
import Figures.*;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        FigureFactory factory = new FigureFactory();
        figures[0] = factory.create(13.4);
        figures[1] = factory.create(12.5, 11.3);
        figures[2] = factory.create(5.0, 5.0, 10.0);

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }

        Animal[] animals = new Animal[4];
        AnimalFactory factory1 = new AnimalFactory();
        animals[0] = factory1.create("Josh", true, 4, false, "small");
        animals[1] = factory1.create("Moe", false, 0, false, "small");
        animals[2] = factory1.create("Gram", true, 4, false, "big");
        animals[3] = factory1.create("Josh", true, 2, true, "small");

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

    }

}


