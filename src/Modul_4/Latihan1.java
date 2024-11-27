/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_4;
//IF ELSE
import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class Latihan1 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian: ");
        int nilai = scanner.nextInt();
        if (nilai >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
