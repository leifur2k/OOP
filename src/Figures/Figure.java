package Figures;

public abstract class Figure {

    protected final double[] array;

    protected Figure(double[] array) {
        this.array = array;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName() + " | Area: " + getArea() + " | Perimeter " + getPerimeter();
    }
}
