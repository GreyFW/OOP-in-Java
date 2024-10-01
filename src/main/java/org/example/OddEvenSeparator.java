package org.example;

import java.util.List;
import java.util.ArrayList;

public class OddEvenSeparator {

    private List<Integer> evenNumbers;
    private List<Integer> oddNumbers;

    public OddEvenSeparator() {
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        }
        else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Чётные числа:\n" + evenNumbers);
    }

    public void odd() {
        System.out.println("Нечётные числа:\n" + oddNumbers);
    }
}
