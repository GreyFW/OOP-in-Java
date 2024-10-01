package org.example;

public class Bell {

    private boolean ring;

    public Bell() {
        ring = true;
    }

    public void sound() {
        if (ring) {
            System.out.println("ding");
            ring = false;
        } else {
            System.out.println("dong");
            ring = true;
        }
    }
}
