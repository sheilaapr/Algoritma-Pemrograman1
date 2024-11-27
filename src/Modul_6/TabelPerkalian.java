/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_6;

/**
 *
 * @author Sheila
 */
public class TabelPerkalian {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Perulangan luar
            for (int j = 1; j <= 5; j++) { // Perulangan dalam
                System.out.print(i * j + "\t"); // Mencetak hasil perkalian
            }
            System.out.println(); // Pindah ke baris baru setelah setiap baris selesai
        }
    }
}

//for (inisialisasi_1; kondisi_1; iterasi_1) {
//// Perulangan luar
//for (inisialisasi_2; kondisi_2; iterasi_2) {
//// Perulangan dalam
//// Blok kode yang akan dijalankan
//}
//}
