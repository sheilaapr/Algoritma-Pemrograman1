/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_11;

/**
 *
 * @author Sheila
 */
public class MethodReturnExample {

    public static void main(String[] args) {
        int hasil = tambah(5, 10); // Memanggil method tambah
        System.out.println("Hasil penjumlahan: " + hasil);
    }
// Mendefinisikan method dengan return value

    public static int tambah(int a, int b) {
        return a + b; // Mengembalikan hasil penjumlahan
    }
}
