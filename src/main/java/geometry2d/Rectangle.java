package geometry2d;

import exceptions.InvalidDimensionException;

public class Rectangle implements Figure {

    private double width;
    private double length;

    public Rectangle(double width, double length) throws InvalidDimensionException {
        if (width <= 0 || length <= 0) {
            throw new InvalidDimensionException("Стороны прямоугольника не могут быть отрицательными или равными 0.");
        }

        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return ("Прямоугольник с шириной = " + width + ",\nДлиной = " + length + "\nПлощадью = " + area());
    }
}
