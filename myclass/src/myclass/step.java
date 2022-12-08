/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import static MainPackage.main.banyakKelas;
import static MainPackage.main.conclass;
import static MainPackage.main.countMHS;
import static MainPackage.main.kelas;
import static MainPackage.main.resolf;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author stepa
 */
public class step {

    public static void main(String[] args) {
      presensiMhs();
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
        int hadir = 0;
        int izin = 0;
        int absent = 0;
        for (int i = 0; i < totalMhs; i++) {
            mhs[i][5] = namaKelas;
            System.out.println("Presensi ke-" + (i + 1));
            mhs[i][0] = String.valueOf(i + 1);
            System.out.print("Masukan Nama : ");
            mhs[i][1] = sc.next();
            System.out.print("Masukan NIM : ");
            mhs[i][2] = sc.next();
            String valid = mhs[i][2].substring(4, 6);
            //Valid NIM
            if (!(valid.equals(univ[0]))) {
                System.out.println("Bukan MHS Sadhar");
            }
            String nimmhs = mhs[i][2].substring(2, 4);
            if (nimmhs.equals(fakultas[0]) && mhs[i][2].length() == 9) {
                mhs[i][3] = "Elektro";
            } else if (nimmhs.equals(fakultas[1]) && mhs[i][2].length() == 9) {
                mhs[i][3] = "Mesin";
            } else if (nimmhs.equals(fakultas[2]) && mhs[i][2].length() == 9) {
                mhs[i][3] = "Informatika";
            } else if (nimmhs.equals(fakultas[3]) && mhs[i][2].length() == 9) {
                mhs[i][3] = "Matematika";
            } else {
                System.out.println("Anda Bukan Mahasiswa FST");
            }
            System.out.println("====PILIH PRESENSI====");
            System.out.println("1. Hadir");
            System.out.println("2. Izin");
            System.out.println("3. Alpha");
            System.out.print("Masukan Anda : ");
            int pilpres = sc.nextInt();
            if (pilpres == 1) {
                mhs[i][6] = "Hadir";
                hadir += 1;
            } else if (pilpres == 2) {
                mhs[i][6] = "Izin";
                izin += 1;
            } else if (pilpres == 3) {
                mhs[i][6] = "Alpha";
                absent += 1;
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
            System.out.println("Nama Kelas : " + mhs[j][5]);
            System.out.println("Presensi : " + mhs[j][6]);
        }
        countMHS++;
        tambahKel++;
        banyakKelas++;
        resolf();
    }

}
