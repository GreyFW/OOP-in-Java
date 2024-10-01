package geometry3d;

import geometry2d.Circle;
import exceptions.InvalidHeightException;

public class Cylinder {
    private Circle foundation;
    private double height;

    public Cylinder(Circle foundation, double height) throws InvalidHeightException {
        if (height <= 0) {
            throw new InvalidHeightException("Высота не может быть отрицательной.");
        }
        this.foundation = foundation;
        this.height = height;
    }

    public double volume() {
        return  foundation.area() * height;
    }

    public String toString() {
        return ("Цилиндр с основанием " + foundation.toString() + " ;\nи высотой = " + height + ";\nобъёмом = " + volume());
    }
}
