/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

/**
 *
 * @author Sheila
 */
public class ForEachArray {

    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
// Menggunakan perulangan for-each untuk mengakses setiap elemen array
        for (int elemen : angka) {
            System.out.println("Nilai elemen: " + elemen);
        }
    }
}
