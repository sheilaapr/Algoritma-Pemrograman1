/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_5;

/**
 *
 * @author Sheila
 */
public class ContinueExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Melewati iterasi ketika i sama dengan 3
            }
            System.out.println("Perulangan ke-" + i);
        }
    }
}
