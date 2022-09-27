package jobsheet5;

/**
 *
 * Created by 21343003_Alkindi Syamsi
 */

import javax.swing.JOptionPane;

public class GetInputFromKeyboard2 {
    public static void main(String args[]){
        String name ="", hoby ="";
        
        name = JOptionPane.showInputDialog("Nama Anda: ");
        hoby = JOptionPane.showInputDialog("Hobi Anda: ");
        
        String msg = "Jadi Hobi Anda "+hoby+". "
                + "Hobi yang bagus "+name;
        
        JOptionPane.showMessageDialog(null,msg);
        
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus " + name);
    }
}
