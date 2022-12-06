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
        String[][] kelas = {{"A","2"},{"B","5"}};
        String[][] mhs = {{"A", "Dimas"}, {"A", "Saril"},
                {"B","Anger"}, {"B", "DImas"},{"B", "DODO"}};
   
        String p = "B";
       for(int i = 0; i< mhs.length; i++){
           if(p.equals(mhs[i][0])){
               System.out.println(" "+mhs[i][0]);
               System.out.println("NAMA : "+mhs[i][1]);
           }
       }
    }
}
