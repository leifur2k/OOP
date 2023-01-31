package Figures;

public class FigureFactory {

    public Figure create(double... array) {
        if (array.length == 1)
            return new Circle(array[0]);
        else if (array.length == 2)
            return new Rectangle(array[0], array[1]);
        else if (array.length == 3)
            return new Triangle(array[0], array[1], array[2]);
        else
            throw new IllegalArgumentException("You cannot create an object with 4 or more arguments passed");
    }

}
