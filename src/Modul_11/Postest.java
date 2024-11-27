/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_11;

/**
 *
 * @author Sheila
 */
public class Postest {

    // Fungsi rekursif untuk menghitung nilai Fibonacci ke-n
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    // Fungsi untuk menampilkan deret Fibonacci hingga elemen ke-n
    public static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 10; // Ubah nilai n untuk mengubah jumlah elemen deret
        
        System.out.println("=== Bilangan Fibonacci ===");
        printFibonacci(n);
    }
}
