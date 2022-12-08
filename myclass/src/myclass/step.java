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
        dataCompare();
    }

    public static void dataCompare() {
        String[][] kelas = {{"A", "10"}, {"B", "20"}};
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
//                              Agkatan                mhs[j][7]
//        }
        String[][] mhs
                = {{"1", "Anger", "225314056", "Informatika", "22/10", "A", "Hadir", "22"},
                {"2", "Sahril", "225314054", "Matematika", "22/10", "A", "Hadir", "22"},
                {"3", "Hendor", "225214056", "Elektro", "22/10", "A", "Ijin", "22"},
                {"4", "Stepanus", "225314055", "Informatika", "22/10", "A", "Alpa", "22"},
                {"1", "Anger", "225314056", "Informatika", "22/10", "B", "Hadir", "22"},
                {"2", "Sahril", "225314054", "Matematika", "22/10", "B", "Hadir", "22"},
                {"3", "Hendor", "225214056", "Elektro", "22/10", "B", "Hadir", "22"},
                {"4", "Stepanus", "225314055", "Informatika", "22/10", "B", "Alpa", "22"}};

        int tambahKel = 2;
        Scanner inp = new Scanner(System.in);
        int pil1 = 0, pil2 = 0;
        if (tambahKel > 1) {
            System.out.println("Pilih Kelas Untuk Di Bandingkan");
            for (int i = 0; i < tambahKel; i++) {
                System.out.printf("%d. %s\n", (i + 1), kelas[i][0]);
            }
            System.out.println("Pilihan Anda : ");
            System.out.printf("Pilihan Ke 1 : ");
            pil1 = inp.nextInt();
            System.out.printf("Pilihan Ke 2 : ");
            pil2 = inp.nextInt();
            System.out.println("Nama Kelas 1 : " + kelas[(pil1 - 1)][0]);
            System.out.println("Nama Kelas 1 : " + kelas[(pil2 - 1)][0]);
            String namaKel1 = kelas[(pil1 - 1)][0];
            String namaKel2 = kelas[(pil2 - 1)][0];
            int tot1 = 0;
            int tot2 = 0;
            int totHd = 0;
            int totHd2 = 0;
            int mostProd1 = 0;
            int mostProd2 = 0;
            for (int i = 0; i < mhs.length; i++) {
                if (mhs[i][5].equals(namaKel1)) {
                    tot1++;
                    if (mhs[i][6].equalsIgnoreCase("Hadir")) {
                        totHd++;
                    } else if (mhs[i][3].equalsIgnoreCase("Hadir")) {
                        totHd++;
                    }
                    for (int j = 0; j < 7; j++) {
                        System.out.print(" ," + mhs[i][j]);
                        if(mhs[i][6].equalsIgnoreCase("Hadir")){
                            mostProd1++;
                        }
                    }
                }
            }
            System.out.println("");
            System.out.println("Hadir : "+mostProd1);
            for (int i = 0; i < mhs.length; i++) {
                if (mhs[i][5].equals(namaKel2)) {
                    tot1++;
                    if (mhs[i][6].equalsIgnoreCase("Hadir")) {
                        totHd2++;
                    }
                }
            }
            System.out.println("Total MHS : " + tot1);
            System.out.println("Total Kelas 1 : " + totHd);
            System.out.println("Total Hadir Kelas 2 : " + totHd2);
            int banding = totHd - totHd2;
            if (totHd > totHd2) {
                System.out.println("Kehadiran Di Kelans Anda lebih Banyak Sebanyak : " + banding);
            } else if (totHd < totHd2) {
                System.out.println("Kehadiran Di Kelans Anda lebih Sedikit Sebanyak : " + banding);
            }
        }
    }

}
