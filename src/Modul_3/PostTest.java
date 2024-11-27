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
public class PostTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Panjang Trek Latihan (km): ");
        int panjangTrek = input.nextInt();

        System.out.print("Masukkan Waktu yang dibutuhkan (menit): ");
        int waktu = input.nextInt();

        System.out.print("Masukkan Panjang Maraton (km): ");
        int panjangMaraton = input.nextInt();
        
        double kRata = panjangTrek/waktu;
        
        double tMaraton =panjangMaraton/kRata;

        System.out.println("Kecepatan Rata-rata: " + kRata);
        System.out.println("Waktu yang dibutuhkan: " + tMaraton);

    }

}
