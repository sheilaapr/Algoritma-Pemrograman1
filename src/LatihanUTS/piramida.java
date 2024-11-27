/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Sheila
 */
public class piramida {

    public static void main(String[] args) {
        int prmd = 5;

        for (int i = 1; i <= prmd; i++) {
            for (int j = 1; j <= prmd - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
