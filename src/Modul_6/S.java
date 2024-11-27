/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_6;

/**
 *
 * @author Sheila
 */
public class S {
    public static void main(String[] args) {
        int n = 5;
        
  for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) ||         // Garis atas
                    (i == n / 2 && j > 0 && j < n - 1) ||     // Garis tengah
                    (i == n - 1 && j > 0 && j < n - 1) ||     // Garis bawah
                    (j == 0 && i > 0 && i < n / 2) ||         // Kolom kiri atas
                    (j == n - 1 && i > n / 2 && i < n - 1)) { // Kolom kanan bawah
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}