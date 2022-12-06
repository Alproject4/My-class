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

    static void makeClass() {
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
            int max=0;
            if(data > max){
                System.out.println("PRODI : "+nameof);
            }
            
        }
        int data = Integer.parseInt(prod[0][1]);
    }
    
   
}
