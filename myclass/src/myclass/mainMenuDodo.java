/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class mainMenuDodo {

    public static String[][] kelas = new String[10][10];
    static String[][] mhs = new String[90][10];
    static int hadir = 0, izin = 0, absent = 0;
    static int tambahKel = 0;
    public static int banyakKelas = 0;
    public static int conclass = 0;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Buat kelas baru\n2. Lihat kelas");
        System.out.print("Pilih 1 atau 2 :");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:

                makeClass();
                break;

            case 2:
                if (conclass < 1) {
                    System.out.println("Belum ada kelas");
                    System.out.println("_______________________");
                    mainMenu();

                }
            default:
                System.out.println("Pilihan anda tidak sesuai");
                System.out.println("___________________________");
                mainMenu();
        }

    }

    public static void makeClass() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tambah kel " + tambahKel);
        conclass++;

        String pilih;

        System.out.println("KELAS BARU");
        System.out.print("NAMA KELAS : ");
        kelas[tambahKel][0] = sc.next();
        System.out.print("TOTAL MHS : ");
        kelas[tambahKel][1] = sc.next();
        System.out.println("Apakah Data Sudah Benar?");
        System.out.println(" Lanjut ke presensi mhs (y/t)");
        pilih = sc.next();
        switch (pilih) {
            case "y":

                System.out.println("Nilai TotalMHS Kel = " + kelas[tambahKel][1]);
                System.out.println("Kelas length : " + kelas.length);
                int totalMhs = Integer.parseInt(kelas[tambahKel][1]);
                presensiMhs(totalMhs);
                break;
            default:
                System.out.println("Pilihan anda tidak sesuai");
                System.out.println("_________________________________________");
                makeClass();
                break;
        }

    }

    static void presensiMhs(int totalMhs) {
        System.out.println("Banyak KElas" + banyakKelas);
        DateFormat DateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date TIME = new Date();
        mhs = new String[totalMhs][5];
        System.out.println("mhs length : " + mhs.length);
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("SELAMAT DATANG SILAHKAN PRESENSI DISINI");
        //inisialisasi baru panjang data mhs
        System.out.println(tambahKel);
        //code fakultas
        String[] fakultas = {"51", "52", "53", "31"};

        //membuat data untuk menampung banyak inputan mhs
        System.out.println(totalMhs);
        //melakukan presensi 
        for (int i = 0; i < totalMhs; i++) {
            System.out.println("Presensi ke-" + (i + 1));
            mhs[i][0] = String.valueOf(i + 1);
            System.out.println("Masukan Nama : ");
            mhs[i][1] = sc.next();
            System.out.println("Masukan NIM : ");
            mhs[i][2] = sc.next();
            String nimmhs = mhs[i][2].substring(2, 4);

            if (nimmhs.equals(fakultas[0]) && mhs[i][2].length() == 9) {
                System.out.println("Elektro");
                mhs[i][3] = "Elektro";
            } else if (nimmhs.equals(fakultas[1]) && mhs[i][2].length() == 9) {
                System.out.println("Mesin");
                mhs[i][3] = "Mesin";
            } else if (nimmhs.equals(fakultas[2]) && mhs[i][2].length() == 9) {
                System.out.println("Informatika");
                mhs[i][3] = "Informatika";
            } else if (nimmhs.equals(fakultas[3]) && mhs[i][2].length() == 9) {
                System.out.println("Matematika");
                mhs[i][3] = "Matematika";
            } else {
                System.out.println("Anda Bukan Mahasiswa FST");
            }

            mhs[i][4] = DateFormat.format(TIME);
            System.out.println("Record : " + mhs[i][4]);

            System.out.println("=================================");
        }

        for (int j = 0; j < totalMhs; j++) {
            System.out.println("=================================");
            System.out.println("Data MHS : ");
            System.out.println("ID : " + mhs[j][0]);
            System.out.println("Nama : " + mhs[j][1]);
            System.out.println("NIM : " + mhs[j][2]);
            System.out.println("Fakultas : " + mhs[j][3]);
            System.out.println("Time Record :" + mhs[j][4]);
        }
        tambahKel++;
        banyakKelas++;
        resolf();

    }

    static void lihDat() {
        System.out.println("Lihat Kelas");
        System.out.println("Nama kelas : ");
        System.out.println("Kelas LENGTH : " + kelas.length);
        System.out.println("Kelas pertama : " + kelas[0][0]);
        System.out.println("Kelas Kedua : " + kelas[1][0]);

        for (int i = 0; i < banyakKelas; i++) {
            System.out.printf("%d. %s\n", (i + 1), kelas[i][0]);
            System.out.println("nilai I :" + i);
        }
        //milih kelas array
        System.out.println("Pilih kelas : ");
        Scanner sc = new Scanner(System.in);
        lookupArray(sc.nextInt());
    }

    public static void resolf() {

        System.out.println("Data berhasil disimpan");

        System.out.println("=================================");
        System.out.println();
        mainMenu();
    }

    public static void lookupArray(int pilih) {

        System.out.println("Mata kuliah : " + kelas[(pilih - 1)][0]);
        String totalMhs = kelas[10][1];

        System.out.println("Total Mahasiswa : " + totalMhs);
        System.out.println("Hadir\t: " + hadir);

        System.out.println("Izin\t: " + izin);
        System.out.println("Absent\t: " + absent);

    }
}
