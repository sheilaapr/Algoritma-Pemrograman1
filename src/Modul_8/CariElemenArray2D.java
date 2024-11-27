/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_8;

/**
 *
 * @author Sheila
 */
public class CariElemenArray2D {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 7;
        boolean ditemukan = false;
// Mencari elemen 7 dalam array

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] == target) {
                    ditemukan = true;

                    System.out.println("Elemen " + target + " ditemukan di baris " + i + ", kolom " + j);
                    break;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");
        }
    }
}
