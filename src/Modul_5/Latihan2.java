/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_5;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = 0;
        int ganjil = angka%2;

        System.out.print("Masukkan angka: ");
        angka = scanner.nextInt();

        while (angka >= 0) {
            System.out.print("Masukkan angka: ");
            angka = scanner.nextInt();
        }

        System.out.println("Anda memasukkan angka negatif. Program selesai.");
    }
}
