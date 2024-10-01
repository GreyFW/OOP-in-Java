package org.example;

import exceptions.InvalidDimensionException;
import exceptions.InvalidHeightException;
import exceptions.InvalidRadiusException;
import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    public void TestBalance() {
        Balance balance = new Balance();
        balance.addRight(5);
        balance.addLeft(5);
        assertEquals('=', balance.result());

        balance.addRight(7);
        assertEquals('R', balance.result());

        balance.addLeft(10);
        assertEquals('L', balance.result());

    }

    @Test
    public void TestButton() {
        Button button = new Button();
        // "нажмём" 3 раза:
        button.click();
        button.click();
        button.click();
        assertEquals(3, button.getAmountOfClicks());

    }

    @Test
    public void TestTable() {
        Table table = new Table(2, 2);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        table.setValue(1, 1, 4);


        assertEquals(4, table.getValue(1, 1));
        assertEquals(2, table.rows());
        assertEquals(2, table.cols());
        assertEquals("1 2 3 4 ", table.toString());
        assertEquals(2.5, table.average());
    }

    @Test
    public void TestCircle() {
        Exception exception = assertThrows(InvalidRadiusException.class, () -> {
            new Circle(-3);
        });
        assertEquals("Радиус не может быть отрицательным или равным 0.", exception.getMessage());
    }

@Test
    public void TestRectangle() {
        Exception exception = assertThrows(InvalidDimensionException.class, () -> {
           new Rectangle(3, -2);
        });
        assertEquals("Стороны прямоугольника не могут быть отрицательными или равными 0.", exception.getMessage());
    }

    @Test
    public void TestCylinder() {
        Exception exception = assertThrows(InvalidHeightException.class, () -> {
            new Cylinder(new Circle(3), -2);
        });
        assertEquals("Высота не может быть отрицательной или равной нулю.", exception.getMessage());
    }

}
