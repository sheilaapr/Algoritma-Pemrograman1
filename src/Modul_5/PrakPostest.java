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
public class PrakPostest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka non-negatif: ");
        int bil = input.nextInt();

        if (bil < 0) {
            System.out.println("Bilangan harus non-negatif!");
        } else {
            int faktorial = 1;

            for (int i = 1; i <= bil; i++) {
                faktorial *= i;
            }
            System.out.println("Bil. Faktorial dari " + bil + " adalah " + faktorial);
        }
    }
}
