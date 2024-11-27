/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_9;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Latihan1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
// Menghitung jumlah karakter
        int panjang = kalimat.length();
        System.out.println("Jumlah karakter: " + panjang);
    }
}
