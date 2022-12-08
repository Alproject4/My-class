/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static myclass.mainMenuDodo.conclass;

/**
 *
 * @author Sahril
 */
public class mainMenuDodo {

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
        System.out.println("+++++++++++++++++MyClass+++++++++++++++++");
        System.out.println("1. Buat kelas baru\n2. Lihat kelas\n3. Presensi\n4.Exit");
        System.out.print("Masukkan Pilihan : ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                crateclass();
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
                if (tambahKel < 1) {
                    System.out.println("PRESENSI TIDAK TERSEDIA!");
                    System.out.println("TAMBAHKAN KELAS TERLEBIH DAHULU");
                } else {
                    classcontrol();
                }
            case 4:
                break;
            default:
                System.out.println("Pilihan anda tidak sesuai");
                System.out.println("!_________________________!");
                mainMenu();
        }
    }

    public static void classcontrol() {
        System.out.println("==========================================");
        System.out.println("\tSELAMAT DATANG DI MYCLASS");
        System.out.println(" \tSILAHKAN PILIH KELAS");
        System.out.println("==========================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Lihat Kelas===========");
        System.out.println("List Kelas : ");
        for (int i = 0; i < tambahKel; i++) {
            System.out.printf("%d. %s\n", (i + 1), kelas[i][0]);
        }
        System.out.print("PILIH KELAS :");
        presensiMhs(sc.nextInt());
    }

    static void presensiMhs(int pilihan) {
        System.out.println("KELAS" + kelas[(pilihan - 1)][0]);
        String namaKelas = kelas[(pilihan - 1)][0];
        DateFormat DateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date TIME = new Date();

        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.printf("\tSELAMAT DATANG DI KELAS %s", namaKelas.toUpperCase());
        System.out.println(" \tSILAHKAN PRESENSI DISINI");
        System.out.println("==========================================");
        //inisialisasi baru panjang data mhs
        String tambahPresensi;
        int totalMhs = 0;
        //code fakultas
        int i = 0;
        String[] fakultas = {"51", "52", "53", "31"};
        String[] univ = {"14"};
        //membuat data untuk menampung banyak inputan mhs
        //melakukan presensi 
        int hadir = 0, ijin = 0, alpha = 0;
        do {
            mhs[countMHS][5] = namaKelas;
            System.out.println("Presensi ke-" + (i + 1));
            mhs[countMHS][0] = String.valueOf(i + 1);
            System.out.print("Masukan Nama : ");
            mhs[countMHS][1] = sc.next();
            int knt;
            do {
                knt = 0;
                System.out.print("Masukan NIM  : ");
                mhs[countMHS][2] = sc.next();
                String valid = mhs[countMHS][2].substring(4, 6);
                //Valid NIM

                if (!(valid.equals(univ[0]))) {
                    System.out.println("Bukan MHS Sadhar");
                }
                if (mhs[countMHS][2].length() >= 10) {
                    System.out.println("\"jumlah input melebihi batas\"");
                }
                String angkatan = mhs[countMHS][2].substring(0, 2);
                mhs[countMHS][7] = angkatan;
                String nimmhs = mhs[countMHS][2].substring(2, 4);
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
                for (int j = 0; j <= i; j++) {
                    if (i > 0) {
                        for (int k = 0; k < j; k++) {
                            if (mhs[k][2].equals(mhs[j][2]) && !(mhs[k][1].equals(mhs[j][1]))) {
                                System.out.println("NIM TIDAK BOLEH SAMA !");
                                System.out.println("MOHON PASTIKAN NIM SUDAH BENAR");
                                System.out.println("Nama : " + mhs[k][1] + " dengan " + mhs[j][1] + " sama");
                                knt = knt + 1;
                            }
                        }
                    }
                }
            } while (knt >= 1);
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
            i++;
            System.out.println("Tambah Presensi Lagi untuk Kelas " + namaKelas);
            System.out.println("y/t");
            System.out.print("Pilihan Anda : ");
            tambahPresensi = sc.next();
            int totalHadir = hadir;
            int totalIzin = ijin;
            int totalAlpa = alpha;
            int total = hadir + ijin + alpha;
            countMHS++;
            totalMhs++;
            kelas[banyakKelas][1] = String.valueOf(total);
            banyakKelas++;
        } while (tambahPresensi.equals("y"));
        resolf();

    }

    static void lihDat() {
        System.out.println("===========Lihat Kelas===========");
        System.out.println("List Kelas : ");
        for (int i = 0; i < tambahKel; i++) {
            System.out.printf("%d. %s\n", (i + 1), kelas[i][0]);
        }
        //milih kelas array
        System.out.print("Pilih kelas : ");
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
        System.out.println("-------------------------");
        System.out.println("Mata kuliah : " + kelas[(pilih - 1)][0]);
        //update dr lihdatAngger move to mainMenuDodo
        System.out.println("-------------------------");
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
    public static void tamplihMhs(int pilih) {
        String namaKelas = kelas[pilih][0];
        int hdCount = 0, ijCount = 0, AbCount = 0;
        int countTI = 0, countEL = 0, countTM = 0, countMTK = 0, countOther = 0;
        System.out.printf("KELAS : %s\n", namaKelas);
        System.out.println("ID.\tNAMA\t\t\t\t\tNIM\t\t\tFAKULTAS\t\t\tTime Record\t\t\tMata Kuliah\t\tPresensi\t\tAngkatan");
        System.out.print("==========================================================================================================");
        System.out.println("========================================================================================================");
        //listing index mhs 
        for (int j = 0; j < mhs.length; j++) {
            if (namaKelas.equals(mhs[j][5])) {
                System.out.printf("%s\t%s\t\t\t\t%s\t\t%s\t\t%s\t\t\t%s\t\t\t%s\t\t%s\n", mhs[j][0], mhs[j][1], mhs[j][2], mhs[j][3], mhs[j][4], mhs[j][5], mhs[j][6], mhs[j][7]);
                System.out.println("");
                if (mhs[j][6].equalsIgnoreCase("Hadir")) {
                    hdCount++;
                } else if (mhs[j][6].equalsIgnoreCase("Izin")) {
                    ijCount++;
                } else if (mhs[j][6].equalsIgnoreCase("Alpha")) {
                    AbCount++;
                }

                if ("Elektro".equalsIgnoreCase(mhs[j][3])) {
                    countEL += 1;
                } else if ("Mesin".equalsIgnoreCase(mhs[j][3])) {
                    countTM += 1;
                } else if ("Informatika".equalsIgnoreCase(mhs[j][3])) {
                    countTI += 1;
                } else if ("Matematika".equalsIgnoreCase(mhs[j][3])) {
                    countMTK += 1;
                } else {
                    countOther += 1;
                }
            }
        }
        System.out.print("==========================================================================================================\n");
        System.out.printf("Total Hadir : %d \t\tTotal Ijin : %d\t\tTotal Absent :%d\n", hdCount, ijCount, AbCount);
         System.out.print("==========================================================================================================\n");
        System.out.printf("Elektro : %d \t\tTeknik Mesin : %d\t\tTeknik Informatika :%d\t\tPendidikan Matematika :%d\t\tLainya : %d\n", countEL, countTM, countTI, countMTK, countOther);
        System.out.println("========================================================================================================\n");
      
        int totalS = hdCount +ijCount +AbCount; 
        
        if(tambahKel > 2){
           dataCompare(pilih, totalS,hdCount );
        }else{
            System.out.println("Belum Ada Kelas Lain Untuk Dibandingkan");
            mainMenu();
        }
    }
    public static void dataCompare(int pil, int totalH, int Hd){
        String compareKls = " " ;
        if(pil == 1){
            compareKls = kelas[(pil+1)][0];
        }else if(pil > 1){
            compareKls = kelas[(pil-1)][0];
        }
        String myKls = kelas[pil][0];
        int hdCount = 0;
        int totalCom =0;
        System.out.println("Nama Kelas Anda : "+myKls);
        System.out.println("Nama Kelas Yang Dibandingkan : "+compareKls);
        for(int i = 0; i<mhs.length; i++){
              if (compareKls.equals(mhs[i][5])) {
                  totalCom++;
                   if (mhs[i][6].equalsIgnoreCase("Hadir")) {
                    hdCount++;
                } 
              }
        }
        int compareTotal = totalH - totalCom;
        if(totalH > totalCom){
            System.out.println("Total Mahasiswa Dikelas Anda Lebih Banyak Sebanyak : "+compareTotal);
        }else{
             System.out.println("Total Mahasiswa Dikelas Anda Lebih Sedikit Sebanyak : "+compareTotal);
        }
        int totalHadir = hdCount - Hd;
        if(Hd > hdCount){
             System.out.println("Kehadiran Mahasiswa Dikelas Anda Lebih Banyak Sebanyak : "+totalHadir);
        }else{
             System.out.println("Kehadiran Mahasiswa Dikelas Anda Lebih Sedikit Sebanyak : "+totalHadir);
        }
        mainMenu();
    }
    
    public static void crateclass() {
        Scanner sc = new Scanner(System.in);
        conclass++;
        System.out.println("*************************");
        System.out.println("\tKELAS BARU");
        System.out.print("NAMA KELAS : ");
        kelas[tambahKel][0] = sc.nextLine();
        tambahKel++;
        mainMenu();
    }
}
