package org.rpp;

/**
 * Diagram poteka pretvori v programski jezik
 */
public class Vaja_14 {
    public static void main(String[] args) {
        int vsota = 0;
        int k = 10;

        while (k >= 1) {
            vsota = vsota + k;
            k = k - 1;
        }

        System.out.println("Vsota je: " + vsota);
    }
}
