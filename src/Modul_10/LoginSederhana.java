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

public class LoginSederhana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menulis username dan password ke file
        try {
            FileWriter fileWriter = new FileWriter("login.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("user123\n123456");
//            bufferedWriter.write("user123");
//            bufferedWriter.write("pw123");
            bufferedWriter.close();

            System.out.println("===== MENU LOG IN =====");
        } catch (IOException e) {
            System.out.println("===== FAILED ===== " + e.getMessage());
        }

        // Meminta input dari pengguna untuk login
        System.out.print("Username: ");
        String u = scanner.nextLine();
        System.out.print("Password: ");
        String p = scanner.nextLine();

        // Membaca kembali isi file dan memeriksa login
        boolean loginSuccessful = false;
        try {
            FileReader fileReader = new FileReader("login.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String username = bufferedReader.readLine();
            String password = bufferedReader.readLine();
            bufferedReader.close();

            if (u.equals(username) && p.equals(password)) {
                loginSuccessful = true;
                System.out.println("\n=======================");
                System.out.println("Login berhasil!");
            } else {
                System.out.println("Login gagal! username atau password salah.");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }

        if (loginSuccessful) {
            System.out.println("Selamat datang, " + u + "!");
            System.out.println("=======================");
        }
    }
}
