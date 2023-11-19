package org.rpp;

/**
 * Napiši program, ki izpiše trikotnik iz zvezdic velikosti 5 spodnje oblike.
 * Primer:
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Vaja_6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
