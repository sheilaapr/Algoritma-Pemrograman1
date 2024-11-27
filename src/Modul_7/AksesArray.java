/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

/**
 *
 * @author Sheila
 */
public class AksesArray {

        public static void main(String[] args) {

            int[] angka = {10, 20, 30, 40, 50};
// Mengakses elemen-elemen array menggunakan indeks
            System.out.println("Elemen pertama: " + angka[0]); // Output: 10
            System.out.println("Elemen ketiga: " + angka[2]); // Output: 30
// Mengubah nilai elemen array
            angka[2] = 35;
            System.out.println("Elemen ketiga setelah diubah: " + angka[2]);
// Output: 35
        }
    }
