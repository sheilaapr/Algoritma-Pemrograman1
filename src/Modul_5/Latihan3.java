/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_5;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;

public class Latihan3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = scanner.nextInt();
        } while (angka != 0);
        System.out.println("Program selesai.");
    }
}
