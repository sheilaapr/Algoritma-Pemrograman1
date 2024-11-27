/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_4;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Latihan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        int nilai = scanner.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }

    }
}
