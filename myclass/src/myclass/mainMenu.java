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
public class mainMenu {

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
        }else if (inp == 2){
            System.out.println("wwwwww");
        }else{
            System.out.println("tolol");
        }
            

    }
    
    public static void presensi(int presensi) {
        System.out.println("Selamat Datang Mahasiswa FST");
        System.out.println("Silakan Presensi ");
        System.out.println("1. Hadir \n2. Izin\n 3. Terlambat \n4. Absen");
        
    }

}

    public static void lihatDat () {
    
}
    