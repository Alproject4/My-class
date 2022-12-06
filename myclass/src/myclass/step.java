/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myclass;

import java.util.Scanner;

/**
 *
 * @author stepa
 */
public class step {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Program Biodata Siswa
        System.out.println("Jumlah Siswa: ");
        int jum = in.nextInt();
        String[] siswa = new String[jum];

        //mengisi data ke array
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Nama siswa ke-" + (i + 1) + ": ");
            siswa[i] = in.next();
        }

        //mencetak nama siswa
        for (String b : siswa) {
            System.out.println(b);
        }

        int[][] a;

        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < i; j++) {

                System.out.println(" " + a[i][j]);
            }
        }
    }
}
