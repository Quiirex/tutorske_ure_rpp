package org.rpp;

import java.util.Scanner;

/**
 * Napiši program, ki v zanki prebere koordinati točke (x,y) in ju posreduje metodi Kvadrant, ta pa vrne številko kvadranta, v katerem se točka nahaja oz. 0, če sta vpisani koordinati koordinatno izhodišče.
 * Zanka naj se konča, ko uporabnik vnese točko (0,0).
 */
public class Vaja_13 {
    public static int Kvadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Vnesite koordinato x:");
            x = scanner.nextInt();
            System.out.println("Vnesite koordinato y:");
            y = scanner.nextInt();
            int kvadrant = Kvadrant(x, y);
            if (kvadrant == 0) {
                System.out.println("Točka (" + x + "," + y + ") je v koordinatnem izhodišču.");
            } else {
                System.out.println("Točka (" + x + "," + y + ") je v " + kvadrant + ". kvadrantu.");
            }
        } while (x != 0 || y != 0);
        scanner.close();
    }
}
