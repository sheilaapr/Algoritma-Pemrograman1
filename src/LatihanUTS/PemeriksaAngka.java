package LatihanUTS;
import java.util.Scanner;

public class PemeriksaAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk membaca input

        System.out.print("Masukkan angka atau kata: ");
        String kata = input.nextLine(); // Membaca input dari pengguna

        boolean semuaAngka = true; // Asumsikan semua karakter adalah angka

        // Periksa setiap karakter satu per satu
        for (int i = 0; i < kata.length(); i++) {
            char karakter = kata.charAt(i);
            if (!Character.isDigit(karakter)) { // Jika karakter bukan angka
                semuaAngka = false;
                break; // Tidak perlu memeriksa karakter selanjutnya
            }
        }

        if (semuaAngka) {
            System.out.println("Inputan adalah angka.");
        } else {
            // Membalik kata
            String kataTerbalik = "";
            for (int i = kata.length() - 1; i >= 0; i--) {
                kataTerbalik += kata.charAt(i);
            }
            System.out.println("Inputan bukan angka. Kata terbalik: " + kataTerbalik);
        }
    }
}