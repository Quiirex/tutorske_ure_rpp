package org.rpp;

import java.util.Scanner;

/**
 * Napiši program, ki prebere število in ga posreduje metodi Negiraj.
 * Ta vrne njegovo negirano vrednost.
 * Preobloži metodo, da bo delovala tako za cela kot za realna števila.
 * Program naj v zanki izpisuje prvotno in negirano vrednost, dokler uporabnik to želi.
 * Preveri, kaj je negativna vrednost števila 0.
 */
public class Vaja_12 {
    public static int Negiraj(int stevilo) {
        return -stevilo;
    }

    public static double Negiraj(double stevilo) {
        return -stevilo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String odgovor;
        do {
            System.out.println("Vnesite celo ali realno število:");
            if (scanner.hasNextInt()) {
                int celoStevilo = scanner.nextInt();
                System.out.println("Prvotno število: " + celoStevilo);
                System.out.println("Negirano število: " + Negiraj(celoStevilo));
            } else if (scanner.hasNextDouble()) {
                double realnoStevilo = scanner.nextDouble();
                System.out.println("Prvotno število: " + realnoStevilo);
                System.out.println("Negirano število: " + Negiraj(realnoStevilo));
            }
            System.out.println("Ali želite nadaljevati? (da/ne)");
            odgovor = scanner.next();
        } while (odgovor.equalsIgnoreCase("da"));
        scanner.close();
    }
}

