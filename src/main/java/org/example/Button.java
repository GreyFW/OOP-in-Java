package org.example;

public class Button {

    private int amountOfClicks;

    public Button() {
        this.amountOfClicks = 0;
    }

    public void click() {
        this.amountOfClicks++;
        System.out.println("Кнопка нажата " + amountOfClicks + " раз.");
    }

    public int getAmountOfClicks() {
        return this.amountOfClicks;
    }
}
