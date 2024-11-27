/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class meanNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai yang ingin diinput: ");
        int inputNilai = input.nextInt();
        double[] nilaiUjian = new double[inputNilai];

        for (int i = 0; i < inputNilai; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        System.out.println("Nilai yang telah diinput: ");
        for (int i = 0; i < inputNilai; i++) {
            System.out.println("Nilai Ujian ke-" + (i + 1) + ": " + nilaiUjian[i]);
        }

        double totalNilai = 0;
        for (double nilai : nilaiUjian) {
            totalNilai += nilai;
        }

        double meanNilai = totalNilai / inputNilai;

        System.out.println("Total\t: " + totalNilai);
        System.out.println("Rata-rata\t: " + meanNilai);
    }
}
