/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_9;

import java.util.Scanner;

/**
 *
 * @author Sheila
 */
public class balikKata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata atau kalimat: ");
        String kata = input.nextLine();

        String balik = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            balik += kata.charAt(i);
        }

        System.out.println("Hasil dibalik: " + balik);
    }
}