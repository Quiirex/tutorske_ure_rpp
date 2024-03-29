package org.rpp;

/**
 * Napiši zanko v zanki sestavljeno iz dveh stavkov while.
 * Notranja zanka naj se izvede 4 krat.
 * Zunanja zanka naj se izvede 7 krat.
 * Notranja zanka naj izpisuje vaše ime.
 * Med imeni naj bo presledek.
 * Po vsakem prehodu zunanje zanke (ko se notranja zanka izvede 4 krat) vstavi novo vrstico.
 */
public class Vaja_3 {
    public static void main(String[] args) {
        int outerCount = 0;
        while (outerCount < 7) {
            int innerCount = 0;
            while (innerCount < 4) {
                System.out.print("Luka ");
                innerCount++;
            }
            System.out.println();
            outerCount++;
        }
    }
}
