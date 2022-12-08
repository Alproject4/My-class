/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

/**
 *
 * @author Sahril
 */
public class NewClass {

    public static void main(String[] args) {
//        String[][] kelas = {{"A","2"},{"B","5"}};
//        String[][] mhs = {{"A", "Dimas", "hadir"}, {"A", "Saril"},
//                {"B","Anger"}, {"B", "DImas"},{"B", "DODO"}};
//   
//        String p = "B";
//       for(int i = 0; i< mhs.length; i++){
//           if(p.equals(mhs[i][0])){
//               System.out.println(" "+mhs[i][0]);
//               System.out.println("NAMA : "+mhs[i][1]);
//           }
//       }

        String[][] kelas = {{"A", "2"}, {"B", "5"}};
        String[][] mhs = {{"A", "Dimas", "hadir"}, {"A", "Saril", "hadir"},
        {"B", "Anger", "hadir"}, {"B", "DImas", "ijin"}, {"B", "DODO", "ijin"}};

        System.out.println("COMPARE KELAS");
        String pilih = "A";
        String compare = "B";
        int hadirPilih = 0;
        int hadirCompare = 0;
        int max=0;
        int pilihMax=0;
        for (int i = 0; i < mhs.length; i++) {
            if (pilih.equals(mhs[i][0]) && mhs[i][2].equals("hadir")) {
                hadirPilih++;
            }else  if (compare.equals(mhs[i][0]) && mhs[i][2].equals("hadir")) {
                hadirCompare++;
            }

            if (pilih.equals(mhs[i][0]) && compare.equals(mhs[i][0])) {
                System.out.println("Total Hadir : ");
                System.out.printf("1. %s : %d\n", pilih, hadirPilih);
                System.out.printf("2. %s : %d ", compare, hadirCompare);

            }
        }
       
        System.out.println("Kelas :"+pilih);
        System.out.println(hadirPilih);
        System.out.println(hadirCompare);
    }

}
