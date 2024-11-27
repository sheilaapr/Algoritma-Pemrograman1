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
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya perulangan pangkat yang ingin anda lakukan: ");
        int batas = input.nextInt();
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua (sebagai pangkat): ");
        int b = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (b < 0) {
                System.out.println("Pangkat tidak boleh negatif.");
            } else if (b == 0) {
                System.out.println(a + " ^ 0 = 1");
            } else {
                int hasil = a * (int) Math.pow(b, i);
                System.out.println(a + " x " + b + "^" + i + " = " + hasil);
            }
        }
    }
}
