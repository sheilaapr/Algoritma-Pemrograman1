/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_7;

/**
 *
 * @author Sheila
 */
import java.util.Scanner;

public class meanNilaiUjian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai ujian yang ingin diinput: ");
        int n = scanner.nextInt();

        double[] nilaiUjian = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextDouble();
        }
        System.out.println("\nNilai-nilai ujian yang telah diinputkan:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nilai ujian ke-" + (i + 1) + ": " + nilaiUjian[i]);
        }

        double totalNilai = 0;
        for (double nilai : nilaiUjian) {
            totalNilai += nilai;
        }

        double rataRataNilai = totalNilai / n; 


        System.out.print("\nTotal nilai: " + totalNilai);
        System.out.print("Rata-rata nilai: " + rataRataNilai);

    }
}
