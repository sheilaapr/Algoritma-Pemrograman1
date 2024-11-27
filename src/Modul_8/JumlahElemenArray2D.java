/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_8;

/**
 *
 * @author Sheila
 */
public class JumlahElemenArray2D {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int total = 0;
// Menjumlahkan semua elemen dalam array
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                total += matriks[i][j];
            }
        }
        System.out.println("Total nilai elemen dalam array: " + total);
    }
}
