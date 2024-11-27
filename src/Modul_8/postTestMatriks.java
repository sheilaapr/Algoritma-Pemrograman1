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
public class postTestMatriks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai matriks (i): ");
        int m = input.nextInt();
        System.out.print("Masukkan nilai matriks (j): ");
        int n = input. nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        System.out.println("\n==== A ====");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt();
            }
            System.out.println("");
        }

        System.out.println("==== B ====");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = input.nextInt();
            }
            System.out.println("");
        }

        System.out.println("==== C ====");
        System.out.println("Matriks A + Matriks B = ");
        //proses hitung
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
