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
public class bilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas= ");
        int batas = input.nextInt();

        System.out.print("Bilangan Genap= ");
        for (int i = 2; i <= batas; i += 2) {
            System.out.print(i + ",");
            }
        }
    }
