/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_8;

/**
 *
 * @author Sheila
 */
public class AksesArray2D {

    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
// Mengakses elemen di baris 1, kolom 2
        System.out.println("Elemen di baris 1, kolom 2: " + matriks[1][2]);
// Output: 7
// Mengubah nilai elemen di baris 2, kolom 3
        matriks[2][3] = 15;
        System.out.println("Elemen di baris 2, kolom 3 setelah diubah: "
                + matriks[2][3]); // Output: 15
    }
}
