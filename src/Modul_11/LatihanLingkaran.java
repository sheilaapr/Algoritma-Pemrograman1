/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_11;

/**
 *
 * @author Sheila
 */
public class LatihanLingkaran {

    public static void main(String[] args) {
        double jariJari = 7;
        double luas = hitungLuas(jariJari);
        double keliling = hitungKeliling(jariJari);
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }

    public static double hitungLuas(double r) {
        return Math.PI * r * r;
    }

    public static double hitungKeliling(double r) {
        return 2 * Math.PI * r;
    }
}
