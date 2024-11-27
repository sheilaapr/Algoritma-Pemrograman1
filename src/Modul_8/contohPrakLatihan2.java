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
public class contohPrakLatihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        int totDiagonal = 0;
        
        //meminta input dari user
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan nilai untuk baris " + i + ", kolom " + j + ": ");
                matriks[i][j] = input.nextInt();
            }           
        }
        //menghitung jumlah elemen diagonal
        for (int i = 0; i < 3; i++) {
            totDiagonal += matriks[i][i];
        }
        System.out.println("Jumlah elemen diagonal utama: " + totDiagonal);
    }
}
