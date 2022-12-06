/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Arrays;
import java.util.Scanner;
import static myclass.presensiGustav.mhs;

/**
 *
 * @author ASUS
 */
public class lihatDatAngger {

    public static String[][] kelas = new String[10][2];
    static String[][] mhs = new String[3][5];
    static int hadir = 0, izin = 0, absent=0;
    public static void main(String[] args) {
        
        lihDat();  
    }

    public static void lihDat() {
        String namakls = null;
        int tot1 = 15, tot2 = 15;
        char Y,T,back;
//        int []kelas = new int [15];
        //menampilkan kelas dalam array
//        System.out.println("Nama kelas : ");
//        for (int i = 0; i < kelas.length; i++) {
//            System.out.printf("%d. %s\n", i + 1, kelas[i][1]);
//
//        }
        do{
        System.out.println("Lihat Data");
        System.out.println("No.\tNama Kelas");
        System.out.print("=================");
        System.out.println("=================");
        for (int i = 0; i < kelas.length; i++) {
            System.out.printf("%d. %s\n", i + 1,"\t"+kelas[i][1]);
        }
        System.out.print("=================");
        System.out.println("=================");
        
        //milih kelas array
        
        System.out.print("Pilih kelas : ");
        Scanner sc = new Scanner(System.in);
        lookupArray(sc.nextInt());
        System.out.println("Apakah anda ingin kembali? (Y/T");
        back = sc.next().charAt(0);
        }while (back == 'Y');
        
        
    }
    //data dari kelas
    public static void lookupArray(int pilih) {
        System.out.println("================================");
        System.out.println("Mata kuliah : " + kelas[pilih][0]);
        String totalMhs = kelas[10][1];

        System.out.println("Total Mahasiswa : " + totalMhs);
        System.out.println("Hadir\t: " +hadir);
        System.out.println("Izin\t: " +izin);
        System.out.println("Absent\t: " +absent);

    }
    
    public static void newClass() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Selamat Datang Mahasiswa FST");
            System.out.println("Silahkan Presensi ");
            System.out.println("1. Hadir\n 2. Izin\n 3.Absent");
            mhs[i][3] = sc.next();
            String inp = mhs[i][3];
            if (inp.equals("1")) {
                mhs[i][3] += "HADIR";
            } else if (inp.equals("2")) {
                mhs[i][3] += "IZIN";
            } else if (inp.equals("3")) {
                mhs[i][3] += "ABSENT";
            }
            
            if (mhs[i][3].equals("HADIR")) {
                hadir += 1;
            }
            else if (mhs[i][
                    3].equals("IZIN")) {
                izin += 1;
            }
            else if (mhs[i][3].equals("ABSENT")) {
                absent +=1;
            }
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
        presensiMhs();

    }
    
    

    public static void presensiMhs() {
        System.out.println("=================================");
        System.out.println("SELAMAT DATANG SILAHKAN PRESENSI DISINI");
        Scanner sc = new Scanner(System.in);
        String DataKelas;
        String totalMhs = kelas[10][1];
        System.out.println("");

        String[] fak = {"51", "52", "53", "31"};
        for (int i = 0; i <= totalMhs.length(); i++) {
            System.out.println("Presensi ke-" + i);
            System.out.println("Masukan Nama : ");
            mhs[i][0] = sc.next();
            System.out.println("Masukan NIM : ");
            mhs[i][1] = sc.next();
            String nimmhs = mhs[i][1].substring(2, 4);
            System.out.println("" + mhs[i][1].length());
            System.out.println(fak[2]);

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

        for (int j = 0; j <= 2; j++) {
            System.out.println("=================================");
            System.out.println("Data MHS : ");
            System.out.println("Nama : " + mhs[j][0]);
            System.out.println("NIM : " + mhs[j][1]);
            System.out.println("Fakultas : " + mhs[j][2]);
        }
    }
}
