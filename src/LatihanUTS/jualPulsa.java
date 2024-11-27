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
public class jualPulsa {
        public static void main(String[] args){
        System.out.println("###Program Pengisian Pulsa###\n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama Anda : ");
        String nama = scan.nextLine();
        System.out.print("Nominal Pengisian Pulsa : Rp. ");
        int nom = scan.nextInt();
        int pulsa,sms, total;
        int pulsaAwal = 23500;
        
        if(nom == 25000){
            pulsa = 0;
            sms = 0;
            total = pulsaAwal + pulsa + nom;
            System.out.println("Pulsa Awal Anda = Rp"+ pulsaAwal +"\nBonus Pulsa = Rp"+ pulsa+
                    "\nTotal Pulsa Anda = Rp"+total+"\nBonus SMS = "+sms);
        } else if(nom == 50000){
            pulsa = 0;
            sms = 50;
            total = pulsaAwal + pulsa + nom;
            System.out.println("Pulsa Awal Anda = Rp"+ pulsaAwal +"\nBonus Pulsa = Rp"+ pulsa+
                    "\nTotal Pulsa Anda = Rp"+total+"\nBonus SMS = "+sms);
        } else if(nom == 100000){
            pulsa = 10000;
            sms = 100;
            total = pulsaAwal + pulsa + nom;
            System.out.println("Pulsa Awal Anda = Rp"+ pulsaAwal +"\nBonus Pulsa = Rp"+ pulsa+
                    "\nTotal Pulsa Anda = Rp"+total+"\nBonus SMS = "+sms);
        } else if(nom == 150000){
            pulsa = 15000;
            sms = 150;
            total = pulsaAwal + pulsa + nom;
            System.out.println("Pulsa Awal Anda = Rp"+ pulsaAwal +"\nBonus Pulsa = Rp"+ pulsa+
                    "\nTotal Pulsa Anda = Rp"+total+"\nBonus SMS = "+sms);
        } else{
            System.out.println("Nominal Pulsa Tersebut Tidak Tersedia!");
        }
    }
}
