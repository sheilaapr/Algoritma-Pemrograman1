/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_11;

/**
 *
 * @author Sheila
 */
public class CalculatorExample {

    public static void main(String[] args) {
        int angka1 = 15;
        int angka2 = 5;

// Memanggil berbagai method dengan operasi aritmatika
        System.out.println("Penjumlahan: " + tambah(angka1, angka2));
        System.out.println("Pengurangan: " + kurang(angka1, angka2));
        System.out.println("Perkalian: " + kali(angka1, angka2));
        System.out.println("Pembagian: " + bagi(angka1, angka2));
    }

// Method untuk penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }

// Method untuk pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public static int kali(int a, int b) {
        return a * b;
    }

// Method untuk pembagian
    public static int bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Kesalahan: Pembagian dengan nol.");
            return 0;
        } else {
            return a / b;
        }
    }
}
