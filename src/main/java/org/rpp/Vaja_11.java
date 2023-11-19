package org.rpp;

import java.util.Scanner;

/**
 * Napiši program, ki prebere dve celi števili, v metodi Vmes pa izpiše vsa cela števila med njima
 */
public class Vaja_11 {
    public static void Vmes(int prvoStevilo, int drugoStevilo) {
        for (int i = prvoStevilo + 1; i < drugoStevilo; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesite prvo celo število:");
        int prvoStevilo = scanner.nextInt();
        System.out.println("Vnesite drugo celo število:");
        int drugoStevilo = scanner.nextInt();
        Vmes(prvoStevilo, drugoStevilo);
        scanner.close();
    }
}
