/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sahril
 */
public class main {

    public static String[][] kelas = new String[10][10];
    static String[][] mhs = new String[90][10];
    static int hadir = 0, izin = 0, absent = 0;
    static int tambahKel = 0;
    public static int banyakKelas = 0;
    public static int conclass = 0;
    public static int dataCompare = 0;

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
                } else {
                    lihDat();
                }
        }
    }

    public static void makeClass() {
        Scanner sc = new Scanner(System.in);
        conclass++;
        System.out.println("KELAS BARU");
        System.out.print("NAMA KELAS : ");
        kelas[tambahKel][0] = sc.next();
        System.out.print("TOTAL MHS : ");
        kelas[tambahKel][1] = sc.next();
        int totalMhs = Integer.parseInt(kelas[tambahKel][1]);
        presensiMhs(totalMhs);
    }

    static void presensiMhs(int totalMhs) {
        DateFormat DateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date TIME = new Date();
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
        String totalMhs = kelas[(pilih-1)][1];
        System.out.println("Total Mahasiswa : " + totalMhs);
        System.out.println("Hadir\t: " + hadir);
        System.out.println("Izin\t: " + izin);
        System.out.println("Absent\t: " + absent);
    }

     static void presensiControl() {
        int countTI = 0, countEL = 0, countTM = 0, countMTK = 0, countOther = 0;

        String[][] prod = {{"1", "Elektro"},
        {"2", "Elektro"},
        {"3", "Mesin"},
        {"4", "Informatika"},
        {"5", "Matematika"}};

        for (String[] prod1 : prod) {
            if ("Elektro".equals(prod1[1])) {
                countEL += 1;
            } else if ("mesin".equals(prod1[1])) {
                countTM += 1;
            } else if ("Informatika".equals(prod1[1])) {
                countTI += 1;
            } else if ("Matematika".equals(prod1[1])) {
                countMTK += 1;
            } else {
                countOther += 1;
            }
            int data = Integer.parseInt(prod1[1]);
            String nameof = prod1[1];
            int max = 0;
            if (data > max) {
                System.out.println("PRODI : " + nameof);
            }

        }
        int data = Integer.parseInt(prod[0][1]);
    }
}
