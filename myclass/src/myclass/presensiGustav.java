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
        for (int i = 0; i <= 2; i++) {
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
