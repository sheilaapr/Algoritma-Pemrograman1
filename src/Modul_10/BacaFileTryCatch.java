/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_10;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Sheila
 */
public class BacaFileTryCatch {

    public static void main(String[] args) {
        try {
            // Membuat objek FileReader untuk membaca file "data.txt"
            FileReader pembacaFile = new FileReader("output.txt");

            // Membungkus FileReader dengan BufferedReader untuk efisiensi
            BufferedReader pembacaBuffered = new BufferedReader(pembacaFile);
            
            // Membaca file baris demi baris
            String baris;
            while ((baris = pembacaBuffered.readLine()) != null) {
                System.out.println(baris); // Mencetak setiap baris ke layar
            }
            
            // Menutup BufferedReader setelah selesai
            pembacaBuffered.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: "
                    + e.getMessage());
        } finally {
            System.out.println("Proses pembacaan file selesai.");
        }
    }
}
