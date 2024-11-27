/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_8;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class contohPrakLatihan1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int[2][3];
// Meminta input dari pengguna
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai untuk baris " + i + ", kolom " + j + ": ");
                matriks[i][j] = scanner.nextInt();
            }
        }
// Mencetak matriks
        System.out.println("Matriks yang dimasukkan:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
