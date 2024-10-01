package geometry2d;

import exceptions.InvalidRadiusException;

public class Circle implements Figure {

    private double radius;

    public  Circle(double radius) throws InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException("Радиус не может быть отрицательным или равным 0.");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return ("Круг радиуса " + radius + ", площади " + area());
    }
}



