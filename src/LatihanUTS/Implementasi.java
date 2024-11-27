package LatihanUTS;

import java.util.Scanner;

public class Implementasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel dengan berbagai tipe data
        int umur, jumlahBuku;
        double hargaBuku, totalHarga;
        char jenisKelamin;
        String nama;

        // Input data dari pengguna
        System.out.print("Masukkan nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        umur = input.nextInt();
        System.out.print("Masukkan jenis kelamin Anda (L/P): ");
        jenisKelamin = input.next().charAt(0);
        System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
        jumlahBuku = input.nextInt();
        System.out.print("Masukkan harga satu buku: ");
        hargaBuku = input.nextDouble();

        // Perhitungan menggunakan operator matematika
        totalHarga = jumlahBuku * hargaBuku;

        // Percabangan (if-else)
        if (umur >= 17) {
            System.out.println("Anda sudah dewasa.");
        } else {
            System.out.println("Anda masih di bawah umur.");
        }

        // Perulangan (for)
        System.out.println("Daftar buku yang dibeli:");
        for (int i = 1; i <= jumlahBuku; i++) {
            System.out.println("Buku ke-" + i);
        }

        // Perulangan bersarang (nested for)
        System.out.println("Tabel perkalian:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        // Output hasil
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}