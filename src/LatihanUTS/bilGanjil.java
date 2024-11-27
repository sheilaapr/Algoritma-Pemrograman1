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
public class bilGanjil {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas: ");
        int batas = input.nextInt();
        
        System.out.print("Bilangan Ganjil dari 1 sampai " + batas + " = ");
        for (int i = 1; i <= batas; i += 2) {
            System.out.print(i + ",");
//            int ganjil = i -1;
//            System.out.print(ganjil+ ",");
               }
        }
}
