/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_3;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class InputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        System.out.println("Nama Anda adalah: " + nama);
        System.out.println("Usia Anda adalah: " + usia);
    }

}
