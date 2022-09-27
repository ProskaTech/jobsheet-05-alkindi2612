package jobsheet5;

/**
 *
 * Created by 213430303_Alkindi Syamsi
 */

import java.util.Scanner;

public class Scanner2 {
     public static void main(String args[]){
         float angka1, angka2, jumlah;
         Scanner data = new Scanner(System.in);
         
         System.out.print("Masukkan Angka Pertama: ");
         angka1 = data.nextFloat();
         
         System.out.print("Masukkan Angka Kedua: ");
         angka2 = data.nextFloat();
         
         jumlah = angka1 + angka2;
         
         System.out.println("Angka Pertama: " + angka1);
         System.out.println("Angka Kedua: " + angka2);
         System.out.println("Jumlah:  " + jumlah);
     }
}
