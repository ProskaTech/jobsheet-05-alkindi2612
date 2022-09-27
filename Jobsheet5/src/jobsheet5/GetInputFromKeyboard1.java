package jobsheet5;

/**
 *
 * Created by 21343003_Alkindi Syamsi
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String args[]){
        BufferedReader data = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hobi = "";
        
        try {
            System.out.print("Nama Anda: ");
            name = data.readLine();
            System.out.printf("Hobi Anda: ");
            hobi = data.readLine();
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Hobi Anda "+hobi+". Hobi yang bagus"+name);
    }
}
