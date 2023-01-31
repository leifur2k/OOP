package Figures;

public class Rectangle extends Figure{

    public Rectangle(double a, double b) {
        super(new double[]{a, b});
    }

    @Override
    public double getPerimeter() {
        return 2 * (array[0] + array[1]);
    }

    @Override
    public double getArea() {
        return array[0] * array[1];
    }
}
