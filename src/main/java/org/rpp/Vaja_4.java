package org.rpp;

/**
 * Napiši program, ki z dvema zankama izpiše kocko iz znakov 'o' veliko 5 x 5.
 */
public class Vaja_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
