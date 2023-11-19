package org.rpp;

/**
 * Napiši program, ki izpiše trikotnik iz zvezdic velikosti 5 obratne oblike kot pri nalogi 6.
 */
public class Vaja_7 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
