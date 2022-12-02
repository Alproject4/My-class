/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class lihatDatAngger {

    public static String[][] kelas = new String[10][2];
    static String[][] mhs = new String[3][5];

    public static void main(String[] args) {
        lihDat();

    }

    public static void lihDat() {
        String namakls = null;
        int tot1 = 15, tot2 = 15;

//        int []kelas = new int [15];
        //menampilkan kelas dalam array
        System.out.println("Nama kelas : ");
        for (int i = 0; i < kelas.length; i++) {
            System.out.printf("%d. %s\n", i + 1, kelas[i][1]);

        }
        //milih kelas array
        System.out.println("Pilih kelas : ");
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        pilih -= 1;
        lookupArray(pilih);
    }

    public static void newClass() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Selamat Datang Mahasiswa FST");
            System.out.println("Silahkan Presensi ");
            System.out.println("1. Hadir\n 2. Izin\n 3.Absent");
            mhs[i][3] = sc.next();
        }
    }

    public static void makeClass() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String pilih;
        do {
            System.out.println("KELAS BARU");
            System.out.println("NAMA KELAS : ");
            kelas[i][0] = sc.next();
            System.out.println("TOTAL MHS : ");
            kelas[i][1] = sc.next();

            System.out.println("Apakah Data Sudah Benar?");
            System.out.println(" Lanjut ke presensi mhs (y/t)");
            pilih = sc.next();
            i++;
        } while (pilih.toLowerCase().equals('y'));
        newClass();
    }

    //data dari kelas
    public static void lookupArray(int pilih) {
        System.out.println("Mata kuliah : " + kelas[pilih]);
        int totMah = 40;
        int hadir = 35, izin = 5, absen = 0;
        System.out.println("Total Mahasiswa : " + totMah);
        System.out.println("Hadir\t: " + hadir);
        System.out.println("Izin\t: " + izin);
        System.out.println("Absent\t: " + absen);
        
    }
}
