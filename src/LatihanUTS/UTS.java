package LatihanUTS;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sheila
 */
public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Banyak bilangan: ");
        int bil = input.nextInt();
        
        if (bil < 2) {
            System.out.println("Berhenti");
        }else{
            int hasil = 1;
            for (int i = 1; i <= bil; i++) {
                System.out.print("Angka ke-" + i + " = ");
                int angka = input.nextInt();
                hasil *= angka;
            }
            System.out.println("Hasil perkalian = " + hasil);
        }
    }
}
