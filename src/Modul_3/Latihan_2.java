/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Latihan_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan Panjang: ");
        double p = scanner.nextInt();

        System.out.print("Masukkan Lebar: ");
        double l = scanner.nextInt();

        // Menghitung luas
        double luas = p * l;
        double keliling = 2*(p+l);
        // Menampilkan Output
        System.out.printf("Luas persegi panjang dengan panjang %.2f dan lebar %.2f adalah %.2f\n", p, l, luas);
        System.out.printf("Keliling persegi panjang dengan panjang %.2f dan lebar %.2f adalah %.2f\n", p, l, keliling);

    }

}
