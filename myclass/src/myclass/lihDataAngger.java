package myclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lihDataAngger {

    public static String[][] kelas = new String[10][10];
    static String[][] mhs = new String[90][10];
    static int hadir = 0, izin = 0, absent = 0;
    static int tambahKel = 0;
    public static int banyakKelas = 0;

    public static void main(String[] args) {
// TODO code application logic here
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Buat kelas baru\n2. Lihat kelas");
        System.out.print("Pilih 1 atau 2 : ");
        int pilih = sc.nextInt();
        if (pilih == 1) {
            makeClass();
        } else if (pilih == 2) {
            lihDat();
        }
        while (pilih > 2 || pilih < 1);
    }

    public static void makeClass() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tambah kel " + tambahKel);

        String pilih;
        do {
            System.out.println("KELAS BARU");
            System.out.print("NAMA KELAS : ");
            kelas[tambahKel][0] = sc.next();
            System.out.print("TOTAL MHS : ");
            kelas[tambahKel][1] = sc.next();
            System.out.println("Apakah Data Sudah Benar?");
            System.out.println(" Lanjut ke presensi mhs (y/t)");
            pilih = sc.next();
        } while (pilih.toLowerCase().equals('t'));
        System.out.println("Nilai TotalMHS Kel = " + kelas[tambahKel][1]);
        System.out.println("Kelas length : " + kelas.length);
        int totalMhs = Integer.parseInt(kelas[tambahKel][1]);
        presensiMhs(totalMhs);
    }

    static void presensiMhs(int totalMhs) {
        System.out.println("Banyak KElas" + banyakKelas);
        DateFormat DateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date TIME = new Date();
        mhs = new String[totalMhs][5];
        //System.out.println("mhs length : " + mhs.length);
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

    public static void tamplihMhs() {
        System.out.println("ID.\tNAMA\t\tNIM\t\t\tFAKULTAS\t\t\tTime Record");
        System.out.print("==============================================");
        System.out.println("==============================================");
        for (int j = 0; j < mhs.length; j++) {
            System.out.printf("%s\t%s\t\t%s\t\t%s\t\t%s\n",mhs[j][0], mhs[j][1], mhs[j][2], mhs[j][3],mhs[j][4] );
        }
        System.out.print("==============================================");
        System.out.println("==============================================");
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Mata kuliah : " + kelas[(pilih - 1)][0]);
        String totalMhs = kelas[(pilih - 1)][1];

        System.out.println("Total Mahasiswa : " + totalMhs);
        System.out.println("Hadir\t: " + hadir);

        System.out.println("Izin\t: " + izin);
        System.out.println("Absent\t: " + absent);
        //update dr lihdatAngger move to mainMenuDodo
        System.out.println("=======================");
        System.out.println("Menu\t:\n1. Lihat Data Mahasiswa\n2. Kembali Menu utama\n3. Exit");
        System.out.print("Pilih\t: ");
        int pilihan = sc.nextInt();
        System.out.println("=======================");
        switch (pilihan) {
            case 1:
                tamplihMhs();
            case 2:
                mainMenu();
            case 3:
                break;
        }

    }

}
