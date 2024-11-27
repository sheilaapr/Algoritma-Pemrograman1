/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

/**
 *
 * @author Sheila
 */
public class ForLoopArray {

    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
// Menggunakan perulangan for untuk mengakses setiap elemen array
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + angka[i]);
        }
    }
}
