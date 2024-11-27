/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_9;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Latihan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan String pertama: ");
        String str1 = scanner.nextLine();
        System.out.print("Masukkan String kedua: ");
        String str2 = scanner.nextLine();
// Menggabungkan String
        String gabungan = str1.concat(str2);
        System.out.println("String gabungan: " + gabungan);
    }
}
