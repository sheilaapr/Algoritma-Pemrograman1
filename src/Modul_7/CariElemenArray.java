/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

/**
 *
 * @author Sheila
 */
public class CariElemenArray {

    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int target = 30;
        boolean ditemukan = false;
        for (int elemen : angka) {
            if (elemen == target) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Elemen " + target + " ditemukan dalam array.");
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");

        }
    }
}
