/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_9;

/**
 *
 * @author Sheila
 */
public class EqualsExample {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
// Menggunakan equals() untuk membandingkan nilai
        System.out.println("str1 equals str2: " + str1.equals(str2)); //Output: true
        System.out.println("str1 equals str3: " + str1.equals(str3)); //Output: true
    }
}
