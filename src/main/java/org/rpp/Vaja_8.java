package org.rpp;

import java.util.Scanner;

/**
 * Napiši program, ki prebere celo število in ugotovi, ali je število liho ali sodo.
 * Če je liho, izpiše: "Število je liho".
 * V nasprotnem izpiše: "Število je sodo".
 * Primer 1: Vpiši število:7 Število je liho.
 * Primer 2: Vpiši število:24 Število je sodo.
 */
public class Vaja_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vpiši število:");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Število je liho");
        } else {
            System.out.println("Število je sodo");
        }
    }
}
