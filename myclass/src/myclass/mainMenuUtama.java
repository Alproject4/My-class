/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Scanner;

/**
 *
 * @author gibra
 */
public class mainMenuUtama {

    public static void main(String[] args) {
        mainMenu(1);
    }

    public static void mainMenu(int inp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Buat kelas baru\n2. Lihat kelas");
        control(sc.nextInt());

    }

    public static void control(int inp) {
        if (inp == 1) {
            System.out.println("hello");
        } else if (inp == 2) {
            System.out.println("wwwwww");
        } else {
            System.out.println("tolol");
        }

    }

    public static void presensi(int presensi) {
        System.out.println("Selamat Datang Mahasiswa FST");
        System.out.println("Silakan Presensi ");
        System.out.println("1. Hadir \n2. Izin\n 3. Terlambat \n4. Absen");

    }
    
        
    public static void presensi(){
        
        System.out.println("Masukan Nama : ");
        System.out.println("Masukan NIM : ");
        String inp = "225314048"; 
        String[] fak = {"52", "53", "51", "54"};
        String nim = "225314048";
        String p = nim.substring(2,4);
        if(p.equals(fak[0])){
            System.out.println("Matematika");
        }else if(p.equals(fak[1])){
            System.out.println("INFORMATIKA");
        }else if(p.equals(fak[2])){
            System.out.println("MESIN");
        }else if(p.equals(fak[3])){
            System.out.println("ELEKTRO");
        }else{
            
        }   
    }
}


   

