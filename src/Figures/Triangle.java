package Figures;

public class Triangle extends Figure{

    public Triangle(double a, double b, double c) {
        super(new double[]{a, b, c});
    }

    @Override
    public double getPerimeter() {
        return array[0] + array[1] + array[2];
    }

    @Override
    public double getArea() {
        double p = (array[0] + array[1] + array[2]) / 2;
        return Math.sqrt(p * (p - array[0]) * (p - array[1]) * (p - array[2]));
    }

    @Override
    public String toString() {
        return super.toString() + " + Difficult Figure!";
    }
}
