/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Scanner;
import static myclass.lihatDatAngger.absent;
import static myclass.lihatDatAngger.hadir;
import static myclass.lihatDatAngger.izin;
import static myclass.lihatDatAngger.kelas;
import static myclass.lihatDatAngger.lookupArray;
import static myclass.lihatDatAngger.mhs;
import static myclass.lihatDatAngger.presensiMhs;
import static myclass.mainMenuUtama.control;

/**
 *
 * @author ASUS
 */
public class mainMenuDodo {

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Buat kelas baru\n2. Lihat kelas");
        System.out.print("Pilih 1 atau 2 :");
        int pilih = sc.nextInt();

        if (pilih == 1) {
            makeClass();

        } else if (pilih == 2) {
            lihDat();

        }
    }

    public static void makeClass() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String pilih;
        do {
            System.out.println("KELAS BARU");
            System.out.print("NAMA KELAS : ");
            kelas[i][0] = sc.next();
            System.out.print("TOTAL MHS : ");
            kelas[i][1] = sc.next();
            System.out.println("total : " + kelas[i][1]);
            System.out.println("Apakah Data Sudah Benar?");
            System.out.println(" Lanjut ke presensi mhs (y/t)");
            pilih = sc.next();
            i++;
        } while (pilih.toLowerCase().equals('t'));
        presensiMhs();

    }
     public static void lihDat() {
        System.out.println("Lihat Kelas");
        int tot = 2;
        System.out.println("Nama kelas : ");
        for (int i = 0; i < tot; i++) {
            System.out.printf("%d. %s\n", i + 1, kelas[i][0]);

        }
        //milih kelas array
        System.out.println("Pilih kelas : ");
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        pilih -= 1;
        lookupArray(pilih);
    }

    public static void presensiMhs() {
        System.out.println("=================================");
        System.out.println("SELAMAT DATANG SILAHKAN PRESENSI DISINI");
        Scanner sc = new Scanner(System.in);
        String DataKelas;
        String totalMhs = kelas[0][1];
        int tot = Integer.parseInt(totalMhs);
        System.out.println("Total Mhs" + totalMhs);
        System.out.println("");

        String[] fak = {"51", "52", "53", "31"};
        for (int i = 0; i < tot; i++) {
            System.out.println("Presensi ke-" + i);
            System.out.println("Masukan Nama : ");
            mhs[i][0] = sc.next();
            System.out.println("Masukan NIM : ");
            mhs[i][1] = sc.next();
            String nimmhs = mhs[i][1].substring(2, 4);

            if (nimmhs.equals(fak[0]) && mhs[i][1].length() == 9) {
                System.out.println("Elektro");
                mhs[i][2] = "Elektro";
            } else if (nimmhs.equals(fak[1]) && mhs[i][1].length() == 9) {
                System.out.println("Mesin");
                mhs[i][2] = "Mesin";
            } else if (nimmhs.equals(fak[2]) && mhs[i][1].length() == 9) {
                System.out.println("Informatika");
                mhs[i][2] = "Informatika";
            } else if (nimmhs.equals(fak[3]) && mhs[i][1].length() == 9) {
                System.out.println("Matematika");
                mhs[i][2] = "Matematika";
            } else {
                System.out.println("Anda Bukan Mahasiswa FST");
            }
            System.out.println("=================================");
        }

        for (int j = 0; j < tot; j++) {
            System.out.println("=================================");
            System.out.println("Data MHS : ");
            System.out.println("Nama : " + mhs[j][0]);
            System.out.println("NIM : " + mhs[j][1]);
            System.out.println("Fakultas : " + mhs[j][2]);
        }
        resolf();

    }

    public static void resolf() {

        System.out.println("Data berhasil disimpan");

        System.out.println("=================================");
        System.out.println();
        mainMenu();
    }

   

    public static void lookupArray(int pilih) {
        System.out.println("Mata kuliah : " + kelas[pilih][0]);
        String totalMhs = kelas[10][1];

        System.out.println("Total Mahasiswa : " + totalMhs);
        System.out.println("Hadir\t: " + hadir);

        System.out.println("Izin\t: " + izin);
        System.out.println("Absent\t: " + absent);

    }
}
