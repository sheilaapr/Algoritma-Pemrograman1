/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;

/**
 *
 * @author Sheila
 */
public class bilangan {
        public static void main(String[] args){
        int max = 20;
        for(int i=1; i<=max; i++){
            System.out.print(" "+i);
        }
        System.out.println("\n\n Bilangan Ganjil");
        for(int i=1; i<=max;i+=2){
            System.out.print(" "+i);
        }
        System.out.println("\n\n Bilangan Genap");
        for(int i=2; i<=max; i+=2){
            System.out.print(" "+i);
        }
        System.out.println();
    }
}