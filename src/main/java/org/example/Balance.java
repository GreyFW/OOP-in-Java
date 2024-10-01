package org.example;

public class Balance {

    private int leftBowl = 0;
    private int rightBowl = 0;

    public void addRight(int weight) {
        rightBowl += weight;
    }

    public void addLeft(int weight) {
        leftBowl += weight;
    }

    public char result() {
        if (leftBowl == rightBowl) {
            return '=';
        }
        else if (leftBowl > rightBowl) {
            return 'L';
        }
        else {
            return  'R';
        }
    }

}
