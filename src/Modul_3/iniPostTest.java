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
public class iniPostTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan panjang trek (km): ");
        double p = scanner.nextInt();
        System.out.print("Masukkan waktu trek (menit): ");
        double t = scanner.nextInt();
        System.out.print("Masukkan panjang maraton (km): ");
        double pMaraton = scanner.nextInt();
        
        //rumus k & t
        double kRata = p/t;
        double tMaraton = pMaraton/kRata;
        
        System.out.println("Kecepatan rata-rata= " + kRata);
        System.out.println("Waktu yang dibutuhkan untuk menyelesaikan maraton dengan panjang 20km = " + tMaraton);        
        
    }
    
}
