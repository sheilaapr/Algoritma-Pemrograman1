/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_6;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;

public class PrakBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi
            for (int j = tinggi; j > i; j--) {
                //System.out.print(" ");
            }

            // Cetak bintang
            for (int k = 0; k <= 1 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
