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
        String[][] mhs = {{"A", "Saril", "11"}, {"A", "dimas", "22"},
        {"B", "Anger", "33"}, {"B", "DImas", "44"}, {"B", "DODO", "11"}};

        System.out.println("COMPARE KELAS");
        String pilih = "A";
        String compare = "B";
        int hadirPilih = 0;
        int hadirCompare = 0;
        int max=0;
        int pilihMax=0;
        
        for(int j = 0 ; j< mhs.length; j++){
            if(j > 0){
                for(int i = 0; i<j; i++){
                    if(mhs[i][2].equals(mhs[j][2]) && !(mhs[i][1].equals(mhs[j][1]))){
                        System.out.println("Nomor : "+mhs[i][2] + " dan "+ mhs[j][2]+" sama");
                    }else{
//                        System.out.println("Salah");
                    }
                }
            }
        }
//        for (int i = 0; i < mhs.length; i++) {
//            if (pilih.equals(mhs[i][0]) && mhs[i][2].equals("ijin")) {
//                hadirPilih++;
//            }else  if (compare.equals(mhs[i][0]) && mhs[i][2].equals("ijin")) {
//                hadirCompare++;
//            }
//            if (pilih.equals(mhs[i][0]) && compare.equals(mhs[i][0])) {
//                System.out.println("Total Hadir : ");
//                System.out.printf("1. %s : %d\n", pilih, hadirPilih);
//                System.out.printf("2. %s : %d ", compare, hadirCompare);
//            }
//        }
//        System.out.println("Kelas :"+pilih);
//        System.out.println(hadirPilih);
//        System.out.println(hadirCompare);
//        int presen = hadirPilih - hadirCompare;
//        if(hadirPilih > hadirCompare){
//            System.out.println("Kehadiran Dikelas Anda lebih banyak sebanyak :"+presen );
//        }else{
//            System.out.println("Kehadiran Dikelas Anda lebih sedikit :"+presen);
//        }
    }

}
