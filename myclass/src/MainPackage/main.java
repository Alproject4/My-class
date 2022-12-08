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
import static myclass.lihDataAngger.kelas;
import static myclass.lihDataAngger.mainMenu;
import static myclass.lihDataAngger.tamplihMhs;
import static myclass.mainMenuDodo.conclass;
import static myclass.mainMenuDodo.makeClass;

/**
 *
 * @author Sahril
 */
public class main {

    public static String[][] kelas = new String[10][10];
    static String[][] mhs = new String[90][10];

    public static int countMHS = 0;
    static int tambahKel = 0;
    public static int banyakKelas = 0;
    public static int conclass = 0;
    public static int dataCompare = 0;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============MyClass===============");
        System.out.println("1. Buat kelas baru\n2. Lihat kelas\n3. Exit");
        System.out.print("Masukkan Pilihan : ");
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
            case 3:
                break;
            default:
                System.out.println("Pilihan anda tidak sesuai");
                System.out.println("!_________________________!");
                mainMenu();
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
        String namaKelas = kelas[(conclass - 1)][0];

        //code fakultas
        String[] fakultas = {"51", "52", "53", "31"};
        String[] univ = {"14"};
        //membuat data untuk menampung banyak inputan mhs
        //melakukan presensi 
        int hadir = 0, ijin = 0, alpha = 0;
        for (int i = 0; i < totalMhs; i++) {
            mhs[countMHS][5] = namaKelas;
            System.out.println("Presensi ke-" + (i + 1));
            mhs[countMHS][0] = String.valueOf(i + 1);
            System.out.print("Masukan Nama : ");
            mhs[countMHS][1] = sc.next();
            System.out.print("Masukan NIM : ");
            mhs[countMHS][2] = sc.next();
            String valid = mhs[i][2].substring(4, 6);
            //Valid NIM
            if (!(valid.equals(univ[0]))) {
                System.out.println("Bukan MHS Sadhar");
            }
            String nimmhs = mhs[i][2].substring(2, 4);
            if (nimmhs.equals(fakultas[0]) && mhs[countMHS][2].length() == 9) {
                mhs[countMHS][3] = "Elektro";
            } else if (nimmhs.equals(fakultas[1]) && mhs[countMHS][2].length() == 9) {
                mhs[countMHS][3] = "Mesin";
            } else if (nimmhs.equals(fakultas[2]) && mhs[countMHS][2].length() == 9) {
                mhs[countMHS][3] = "Informatika";
            } else if (nimmhs.equals(fakultas[3]) && mhs[countMHS][2].length() == 9) {
                mhs[countMHS][3] = "Matematika";
            } else {
                mhs[countMHS][3] = "Tidak Terdaftar";
                System.out.println("Anda Bukan Mahasiswa FST");
            }
            System.out.println("====PILIH PRESENSI====");
            System.out.println("1. Hadir");
            System.out.println("2. Izin");
            System.out.println("3. Alpha");
            System.out.print("Masukan Anda : ");
            int pilpres = sc.nextInt();
            if (pilpres == 1) {
                mhs[countMHS][6] = "Hadir";
                hadir += 1;
            } else if (pilpres == 2) {
                mhs[countMHS][6] = "Izin";
                ijin += 1;
            } else if (pilpres == 3) {
                mhs[countMHS][6] = "Alpha";
                alpha += 1;
            }
            mhs[countMHS][4] = DateFormat.format(TIME);
            System.out.println("Record : " + mhs[countMHS][4]);
            System.out.println("=================================");
            countMHS++;
        }
//        for (int j = 0; j < totalMhs; j++) {
//            System.out.println("=================================");
//            System.out.println("Data MHS : ");
//            System.out.println("ID : " + mhs[j][0]);
//            System.out.println("Nama : " + mhs[j][1]);
//            System.out.println("NIM : " + mhs[j][2]);
//            System.out.println("Fakultas : " + mhs[j][3]);
//            System.out.println("Time Record :" + mhs[j][4]);
//            System.out.println("Nama Kelas : " + mhs[j][5]);
//            System.out.println("Presensi : " + mhs[j][6]);
//        }
        tambahKel++;
        banyakKelas++;
        resolf();
    }

    static void lihDat() {
        System.out.println("============Lihat Kelas============");
        System.out.println("List Kelas : ");
        for (int i = 0; i < banyakKelas; i++) {
            System.out.printf("%d. %s\n", (i + 1), kelas[i][0]);
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
        int hadir = 0, izin = 0, absent = 0;
//        for (int i = 0; i < mhs.length; i++) {
//            if (mhs[i][6].equals("Hadir")) {
//                hadir += 1;
//            } else if (mhs[i][6].equals("Izin")) {
//                izin += 1;
//            } else if (mhs[i][6].equals("Absent")) {
//                absent += 1;
//            }
//        }
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
                tamplihMhs(pilih - 1);
            case 2:
                mainMenu();
            case 3:
                break;
            default:
                System.out.println("Pilihan anda tidak sesuai");
                System.out.println("___________________________");
                mainMenu();

        }
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

    public static void tamplihMhs(int pilih) {
        String namaKelas = kelas[pilih][0];
        System.out.printf("KELAS : %s\n", namaKelas);
        System.out.println("ID.\tNAMA\t\tNIM\t\t\tFAKULTAS\t\t\tTime Record\t\tMata Kuliah\t\tPresensi");
        System.out.print("======================================================================================================");
        System.out.println("====================================================================================================");

        //listing index mhs 
        for (int j = 0; j < mhs.length; j++) {
            if (namaKelas.equals(mhs[j][5])) {
                System.out.printf("%s\t%s\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t%s\n", mhs[j][0], mhs[j][1], mhs[j][2], mhs[j][3], mhs[j][4], mhs[j][5], mhs[j][6]);
            }
//            System.out.printf("%s\t%s\t\t%s\t\t%s\t\t%s\n", mhs[j][0], mhs[j][1], mhs[j][2], mhs[j][3], mhs[j][4]);
        }
        System.out.print("======================================================================================================");
        System.out.println("=====================================================================================================");
    }

    public static void dataCompare() {
        System.out.println("E");
    }
}
