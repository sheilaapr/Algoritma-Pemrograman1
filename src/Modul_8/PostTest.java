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
public class PostTest {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = input.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        System.out.println("\n=== Masukkan elemen matriks A ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Masukkan nilai untuk A[" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("\n=== Masukkan elemen matriks B ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Masukkan nilai untuk B[" + i + "][" + j + "]: ");
                b[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\n=== Hasil Penjumlahan ===");
        System.out.println("Matriks A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Matriks B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("Matriks A + Matriks B = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
