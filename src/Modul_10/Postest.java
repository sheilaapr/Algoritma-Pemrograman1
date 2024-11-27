/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Postest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menulis input pengguna ke file
        try {
            FileWriter fileWriter = new FileWriter("login.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("user123");
            bufferedWriter.write("pass123");
            bufferedWriter.close();

            System.out.println("==== MENU LOG IN ====");
        } catch (IOException e) {
            System.out.println("==== FAILED ===="
                    + e.getMessage());
        }

        // Meminta input dari pengguna
        System.out.print("Masukkan Username: ");
        String logUser = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String logPw = scanner.nextLine();

        // Membaca kembali isi file dan memeriksa login
        boolean loginSuccessful = false;
        try {
            FileReader fileReader = new FileReader("login.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String storedUsername = bufferedReader.readLine();
            String storedPassword = bufferedReader.readLine();
            bufferedReader.close();

            if (logUser.equals(storedUsername) && logPw.equals(storedPassword)) {
                loginSuccessful = true;
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Username atau password salah.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }

        if (loginSuccessful) {
            System.out.println("Selamat datang, " + logUser + "!");
        }
    }
}
