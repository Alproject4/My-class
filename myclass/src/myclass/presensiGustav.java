/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Scanner;

/**
 *
 * @author gibra
 */
public class presensiGustav {

    static String[][] mhs = new String[3][5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] fak = {"51", "52", "53", "31"};
        String[] univ = {"14"};
        for (int i = 0; i <= 2; i++) {
            do {
                //Validasi NIM
                System.out.println("Presensi ke-" + i);
                System.out.println("Masukan Nama : ");
                mhs[i][0] = sc.nextLine();
                System.out.println("Masukan NIM : ");
                mhs[i][1] = sc.next();
                String nimmhs = mhs[i][1].substring(2, 4);
                String angkatan = mhs[i][1].substring(0, 2);
                String valid = mhs[i][1].substring(4, 6);
                //Valid NIM
                if (!(valid.equals(univ[0]))) {
                    System.out.println("Bukan MHS Sadhar");
                }
                System.out.println("angkatan : 20" + angkatan);
                mhs[i][4] = angkatan;
                System.out.println("" + mhs[i][1].length());
                System.out.println(fak[2]);
                if (mhs[i][1].length() >= 10) {
                    System.out.println("\"jumlah input melebihi batas\"");
                    System.out.println("");
                }
                
                //compare nim tidak boleh sama
                if (i > 0) {
                    String compareNIM = mhs[i][1];
                    for (int j = 0; j < i; j++) {
                        if (compareNIM.equals(mhs[j][1])) {
                           
                            System.out.println("");
                            System.out.println("Inputan NIM sama");
                        } 
                    }
                }

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
                System.out.println("==================================");
                if (!(mhs[i][1].length() == 9)) {
                    System.out.println("Inputan Nim Tidak Sesuai");
                }

                //Sahril nim duplicat
            } while (!(mhs[i][1].length() == 9));
            
            //Presensi
            System.out.println("==========PILIH PRESENSI==========");
            System.out.println("1. Hadir");
            System.out.println("2. Izin");
            System.out.println("3. Alpha");
            System.out.println(" ");
            int pilpres = sc.nextInt();
            if (pilpres == 1) {
                mhs[i][3] = "Hadir";
            } else if (pilpres == 2) {
                mhs[i][3] = "Izin";
            } else if (pilpres == 3) {
                mhs[i][3] = "Alpha";
            }

            String dup = mhs[i][1];
        }
        for (int j = 0;
                j <= 2; j++) {
            System.out.println("==================================");
            System.out.println("Data MHS : ");
            System.out.println("Nama : " + mhs[j][0]);
            System.out.println("NIM : " + mhs[j][1]);
            System.out.println("Fakultas : " + mhs[j][2]);
            System.out.println("Presensi : " + mhs[j][3]);
            System.out.println("Angkatan : " + mhs[j][4]);
        }
    }

    public static void presensikontrol() {
        System.out.println("====PILIH PRESENSI====");
        System.out.println("1. Hadir");
        System.out.println("2. Izin");
        System.out.println("3. Alpha");
        System.out.println(" ");

    }
}
