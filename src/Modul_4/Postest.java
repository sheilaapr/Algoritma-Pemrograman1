/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_4;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Postest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nm = input.nextLine();
        System.out.print("Masukkan hari pemutaran film: ");
        String hari = input.nextLine();

        int hrgTiket = 0;
        boolean weekend = hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu");

        System.out.print("Pilih jenis kursi (REGULAR/VIP/PREMIUM): ");
        String kursi = input.nextLine().toUpperCase();

        switch (kursi) {
            case "REGULAR":
                if (weekend) {
                    hrgTiket = 40000;  // Akhir pekan
                } else {
                    hrgTiket = 25000;  // Hari kerja
                }
                break;
            case "VIP":
                if (weekend) {
                    hrgTiket = 60000;  // Akhir pekan
                } else {
                    hrgTiket = 45000;  // Hari kerja
                }
                break;
            case "PREMIUM":
                if (weekend) {
                    hrgTiket = 80000;  // Akhir pekan
                } else {
                    hrgTiket = 65000;  // Hari kerja
                }
                break;
            default:
                System.out.println("Jenis kursi tidak valid:()");
                return;
        }

        System.out.println("Harga tiket untuk hari " + hari + " dengan kursi " + kursi + " adalah Rp." + hrgTiket);
    }

}
