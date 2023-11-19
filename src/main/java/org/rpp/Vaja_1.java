package org.rpp;

/**
 * Napiši program, ki izpiše števila 20,22,24,...,200.
 * Števila naj bodo ločena z vejico in presledkom za vejico.
 * Na koncu naredi piko.
 * Nalogo reši z zanko while/do-while ali for.
 */
public class Vaja_1 {
    public static void main(String[] args) {
        int i = 20;
        while (i <= 200) {
            System.out.print(i);
            if (i < 200) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
            i += 2;
        }
    }
}
