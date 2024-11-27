/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_5;
import java.util.Scanner;

/**
 *
 * @author Sheila
 */

import java.util.Scanner;

public class Postest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat non-negatif: ");
        int input = scanner.nextInt();

        if (input < 0) {
            System.out.println("Bilangan harus non-negatif.");
        } else {
           int faktorial = 1;

            for (int i = 1; i <= input; i++) {
                faktorial *= i;
            }

            System.out.println("Faktorial dari " + input + " adalah " + faktorial);
        }
    }
}
