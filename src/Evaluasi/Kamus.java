/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Evaluasi; 
import java.util.*;
/**
 *
 * @author Sheila
 */
public class Kamus {
    static int pilihan;
    static String tambahan;
    static String indonesia;
    static Scanner scanner = new Scanner(System.in);
    static String kamus  [][] ={
            {"Mobil", "Car"},
            {"Rumah","House"},
            {"Kuda","Horse"},
    };
    public static void main(String[] args) {

        while (true){
            try {
                System.out.println("Kamus Bahasa Inggris");
                System.out.println("");
                System.out.println("1. Pencarian Kata");
                System.out.println("2. Tambahkan Kata");
                System.out.println("3. Daftar Kata");
                System.out.println("4. Kembali");
                System.out.println("Pilih Operasi (1/2/3/4)");

                pilihan = Integer.parseInt(scanner.nextLine());
                switch (pilihan) {
                    case 1:
                        data();
                        break;
                    case 2:
                        kamus = Arrays.copyOf(kamus, kamus.length + 1);
                        kamus[kamus.length - 1] = new String[2];

                        System.out.println("Indonesia: ");
                        tambahan = scanner.nextLine();
                        kamus[kamus.length - 1][0] = tambahan;

                        System.out.println("Inggris: ");
                        tambahan = scanner.nextLine();
                        kamus[kamus.length - 1][0] = tambahan;
                        break;
                    case 3:
                        System.out.println("Daftar Kata");
                        for (int i = 0; i < kamus.length; i++) {
                            System.out.println("Indonesia: " + kamus[i][0]);
                            System.out.println("Inggris: " + kamus[i][1]);
                        }
                    case 4:
                        System.out.println("Terima Kasih");
                        System.exit(0);
                        break;
                    default:
                }
            }catch(NumberFormatException e){
                System.out.println("Input Harus Berupa Angka");
            }
        }
    }
    static void data (){
        while (true){
            System.out.println("1. Indonesia");
            System.out.println("2. Kembali");
            System.out.println("Pilih Operasi (1/2)");

            pilihan = Integer.parseInt(scanner.nextLine());
            scanner.nextLine();
            switch (pilihan){
                case 1:
                    System.out.println("Masukan Kata");
                    indonesia = scanner.nextLine();
                    for (int i = 0;i < kamus.length; i++) {
                        if (kamus[i][0].toLowerCase().contains(indonesia)){
                            System.out.println("Indonesia: "+kamus[i][0]);
                            System.out.println("Inggris: "+kamus[i][1]);
                        }
                    }
                case 2:
                    data();
            }
        }
    }
    static void data1 (){
        try {
            System.out.println("Kamus Bahasa Inggris");
            System.out.println("");
            System.out.println("1. Pencarian Kata");
            System.out.println("2. Tambahkan Kata");
            System.out.println("3. Daftar Kata");
            System.out.println("4. Kembali");
            System.out.println("Pilih Operasi (1/2/3/4)");

            pilihan = Integer.parseInt(scanner.nextLine());
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    data();
                    break;
                case 2:
                    kamus = Arrays.copyOf(kamus, kamus.length + 1);
                    kamus[kamus.length - 1] = new String[2];

                    System.out.println("Indonesia: ");
                    tambahan = scanner.nextLine();
                    kamus[kamus.length - 1][0] = tambahan;

                    System.out.println("Inggris: ");
                    tambahan = scanner.nextLine();
                    kamus[kamus.length - 1][0] = tambahan;
                    break;
                case 3:
                    System.out.println("Daftar Kata");
                    for (int i = 0; i < kamus.length; i++) {
                        System.out.println("Indonesia: " + kamus[i][0]);
                        System.out.println("Inggris: " + kamus[i][1]);
                    }
                case 4:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
            }
        }catch(NumberFormatException e){
            System.out.println("Input Harus Berupa Angka");
        }
    }
}