/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_8;

/**
 *
 * @author Sheila
 */
public class ForLoopArray2D {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        // Menggunakan perulangan bersarang untuk mengakses elemen-elemen array
        for (int i = 0; i < matriks.length; i++) { // Perulangan untuk baris
            for (int j = 0; j < matriks[i].length; j++) { // Perulangan untuk kolom
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris selesai
        }
    }
}
