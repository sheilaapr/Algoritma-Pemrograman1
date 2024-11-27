/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_11;

/**
 *
 * @author Sheila
 */
public class RekursiExample {

    public static void main(String[] args) {
        int angka = 5;
        int hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah: "
                + hasil);
    }

    // Method rekursif untuk menghitung faktorial
    public static int faktorial(int n) {
        if (n == 1) { // Kondisi berhenti
            return 1;
        } else {
            return n * faktorial(n - 1); // Memanggil dirinya sendiri
        }
    }
}
