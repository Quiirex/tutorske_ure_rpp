package org.rpp;

/**
 * Napiši metodo Jaz, ki trikrat izpiše vaše ime.
 * Ime loči s presledki.
 * V glavnem programu uporabi metodo tako, da bo trikrat izpisala vaše ime.
 */
public class Vaja_9 {
    public static void Jaz(String ime) {
        for (int i = 0; i < 3; i++) {
            System.out.print(ime + " ");
        }
    }

    public static void main(String[] args) {
        Jaz("Luka");
    }
}
