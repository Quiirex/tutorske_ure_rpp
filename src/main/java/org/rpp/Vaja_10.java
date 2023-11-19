package org.rpp;

import java.util.Scanner;

/**
 * Napiši metodo z imenom JazVOkvircku.
 * Metoda naj izpiše vaše ime in priimek, okoli njiju pa okvirček iz zvezdic.
 * V glavnem programu uporabi metodo v zanki, tako da po vsakem izpisu vprašaš uporabnika, ali želi še en izpis.
 */
public class Vaja_10 {
    public static void JazVOkvircku(String ime, String priimek) {
        String polnoIme = ime + " " + priimek;
        String zvezdice = new String(new char[polnoIme.length() + 4]).replace('\0', '*');

        System.out.println(zvezdice);
        System.out.println("* " + polnoIme + " *");
        System.out.println(zvezdice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String odgovor;
        do {
            JazVOkvircku("Luka", "Mlinarič");
            System.out.println("Ali želite še en izpis? (da/ne)");
            odgovor = scanner.nextLine();
        } while (odgovor.equalsIgnoreCase("da"));
        scanner.close();
    }
}
