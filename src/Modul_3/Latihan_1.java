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
public class Latihan_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima input dari pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();
        scanner.nextLine(); // Menangkap newline
        System.out.print("Masukkan alamat Anda: ");
        String alamat = scanner.nextLine();
        System.out.print    ("Masukkan No. HP: ");
        double hp = scanner.nextDouble();
        
        // Menampilkan output
        System.out.println("\nInformasi yang Anda masukkan:");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
        System.out.println("No. HP: " + hp);
    }
}

