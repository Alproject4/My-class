/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Arrays;
import java.util.Scanner;
import static myclass.mainMenuDodo.kelas;
import static myclass.mainMenuDodo.mhs;
import static myclass.mainMenuDodo.presensiMhs;
import static myclass.mainMenuDodo.resolf;
import static myclass.mainMenuDodo.tambahKel;

/**
 *
 * @author ASUS
 */
public class olahDatSahrilNorbet {
    public static void main(String[] args) {
        makeClass();
    }
       public static void makeClass() {
        Scanner sc = new Scanner(System.in);
        String pilih;
        do {
            int i = 1; 
            kelas = new String[i][5];
            i++;
            System.out.println("ini kelas length :" + kelas.length);
            System.out.println("KELAS BARU");
            System.out.print("NAMA KELAS : ");
            kelas[tambahKel][0] = sc.next();
            System.out.print("TOTAL MHS : ");
            kelas[tambahKel][1] = sc.next();
            System.out.println("total : " + kelas[tambahKel][1]);
            System.out.println("Apakah Data Sudah Benar?");
            System.out.println(" Lanjut ke presensi mhs (y/t)");
            pilih = sc.next();
            tambahKel++;
        } while (pilih.toLowerCase().equals('t'));
        presensiMhs();
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
            System.out.println("Presensi ke-" + (i + 1));
            System.out.println("Masukan Nama : ");
            mhs[i][0] = sc.next();
            System.out.println("Masukan NIM : ");
            mhs[i][1] = sc.next();
            String nimmhs = mhs[i][1].substring(2, 4);
            String angkatan = mhs[i][1].substring(0,2);
            System.out.println(angkatan+ " angkatan");
            if (nimmhs.equals(fak[0]) && mhs[i][1].length() == 9) {
                System.out.println("Elektro");
                mhs[i][2] += "Elektro";
            } else if (nimmhs.equals(fak[1]) && mhs[i][1].length() == 9) {
                System.out.println("Mesin");
                mhs[i][2] += "Mesin";
            } else if (nimmhs.equals(fak[2]) && mhs[i][1].length() == 9) {
                System.out.println("Informatika");
                mhs[i][2] += "Informatika";
            } else if (nimmhs.equals(fak[3]) && mhs[i][1].length() == 9) {
                System.out.println("Matematika");
                mhs[i][2] += "Matematika";
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
        sumData();
    }
       
       public static void sumData(){
           System.out.println("Data Presensi :" );
           for(int i = 0; i < kelas.length; i++){
               System.out.println("data Kelas ke-"+i);
               System.out.println("total mhs : "+kelas[i][1]);
               int banyak = (int) mhs[0][2].length();
               System.out.println("Fakultas Paling Banyak :"+kelas[i][2]);
               System.out.println("banyak Hadir : ");
               System.out.println("Banyak Ijin : ");
               System.out.println("Banyak ABSEN : ");
               System.out.println("Rentang angkatan yang hadir : ");
           }
       }
       
       
}
