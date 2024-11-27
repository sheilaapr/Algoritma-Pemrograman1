/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_10;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Sheila
 */
public class TulisFileTryCatch {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            // Membuat objek FileWriter untuk menulis ke file "output.txt"
            FileWriter penulisFile = new FileWriter("output.txt");
            // Membungkus FileWriter dengan BufferedWriter untuk efisiensi
            BufferedWriter penulisBuffered = new BufferedWriter(penulisFile);
            // Menulis data ke file
            // Coba pake scanner
            penulisBuffered.write(input.nextLine()+"\n");
            // Coba langsung
            penulisBuffered.write("Menulis ke file menggunakan FileWriter dan BufferedWriter.\n");
            penulisBuffered.write("Operasi ini lebih efisien dengan buffering.");
            // Menutup BufferedWriter setelah selesai
            penulisBuffered.close();
            System.out.println("Berhasil menulis ke file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        } finally {
            System.out.println("Proses penulisan file selesai.");
        }
    }
}
