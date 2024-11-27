/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class bilPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        
        boolean prima = true;
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i ==0) {
                prima = false;
                break;
            }
        }
        
        if ( prima && angka > 1) {
            System.out.println(angka + " adalah bilangan prima");
        }else{
            System.out.println(angka + " bukan bilangan prima"); 
        }
    }
}
