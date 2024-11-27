/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_10;

import java.io.FileWriter; 
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class LatihanFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Meminta input dari pengguna
        System.out.print("Masukkan teks yang ingin disimpan: ");
        String inputTeks = scanner.nextLine();
        // Menulis input pengguna ke file
        try {
            FileWriter fileWriter = new FileWriter("teks_user.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(inputTeks);
            bufferedWriter.close();
            System.out.println("Teks berhasil disimpan ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: "
                    + e.getMessage());
        }
        // Membaca kembali isi file dan menampilkannya
        try {
            FileReader fileReader = new FileReader("teks_user.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String baris;
            System.out.println("Isi file:");
            while ((baris = bufferedReader.readLine()) != null) {
                System.out.println(baris);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
