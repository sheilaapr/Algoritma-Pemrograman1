package Evaluasi;
import java.util.Scanner;

public class cobaCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Kopi", "Teh", "Jus", "Kue", "Roti"};
        int[] harga = {15000, 10000, 20000, 25000, 30000};

        int opsi;
        int qty;
        int total = 0;
        int jmlMinum = 0;

        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp. " + harga[i]);
        }

        do {
            System.out.print("Masukkan pilihan (1-5): ");
            opsi = input.nextInt();

            switch (opsi) {
                case 1: 
                    System.out.print("Jumlah beli: ");
                    qty = input.nextInt();
                    total += harga[0] * qty;
                    jmlMinum += qty; 
                    break;

                case 2: 
                    System.out.print("Jumlah beli: ");
                    qty = input.nextInt();
                    total += harga[1] * qty;
                    jmlMinum += qty;
                    break;

                case 3: 
                    System.out.print("Jumlah beli: ");
                    qty = input.nextInt();
                    total += harga[2] * qty;
                    jmlMinum += qty; 
                    break;

                case 4: 
                    System.out.print("Jumlah beli: ");
                    qty = input.nextInt();
                    total += harga[3] * qty;
                    break;

                case 5: 
                    System.out.print("Jumlah beli: ");
                    qty = input.nextInt();
                    total += harga[4] * qty;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            System.out.print("Apakah Anda ingin memesan lagi? (ya/tidak): ");
            input.nextLine(); 
        } while (input.nextLine().equalsIgnoreCase("ya"));

        if (jmlMinum >= 3) {
            total *= 0.85;
            System.out.println("SELAMAT!!"
                    + "\nAnda mendapatkan diskon 15% memesan minimal 3 minuman.");
        }

        double pajak = total * 0.10;
        System.out.println("Total sebelum pajak: Rp " + total);
        System.out.println("Pajak 10%: Rp " + pajak);
        System.out.println("Total setelah pajak: Rp " + (total + pajak));
    }
}
