package org.rpp;

import java.util.Scanner;

/**
 * Napiši program, ki v zanki prebere 10 celih števil (vpiše jih uporabnik),
 * izračuna njihovo vsoto in jo izpiše.
 */
public class Vaja_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Vnesi %d. število: ", i + 1);
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("Vsota vnesenih števil je: " + sum);
    }
}
