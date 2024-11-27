/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanUTS;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Sheila
 */
public class FungsiProsedur {
     public static ArrayList listBuah = new ArrayList();
    public static boolean isRunning = true;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void showMenu() throws IOException{
        System.out.println("===== MENU =====");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU> ");
        
        int selectedMenu = Integer.valueOf(br.readLine());
        switch(selectedMenu){
            case 1 :
                showAllBuah();
                break;
            case 2 :
                insertBuah();
                break;
            case 3 :
                editBuah();
                break;
            case 4 :
                deleteBuah();
                break;
            case 5 :
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Salah !!!");
        }
    }
    public static void showAllBuah(){
        if(listBuah.isEmpty()){
            System.out.println("Belum ada data");
        }else{
            for(int i=0; i<listBuah.size(); i++){
                System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
            }
        }
    }
    public static void insertBuah() throws IOException{
        System.out.print("Nama buah : ");
        String namaBuah = br.readLine();
        listBuah.add(namaBuah);
    }
    public static void editBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomor buah : ");
        int indexBuah = Integer.valueOf(br.readLine());
        
        System.out.print("Buah Baru : ");
        String namaBaru = br.readLine();
        
        listBuah.set(indexBuah, namaBaru);
    }
    public static void deleteBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomor buah : ");
        int indexBuah = Integer.valueOf(br.readLine());
        
        listBuah.remove(indexBuah);
    }
    public static void main(String[] args) throws IOException{
        do{
            showMenu();
        }while (isRunning);
    }
}
