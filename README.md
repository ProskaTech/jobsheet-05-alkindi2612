Created by 21343003_Alkindi Syamsi
Pada pertemuan jobsheet 5 ini, yang saya pelajari adalah bagaimana mengaplikasikan kelas scanner, BufferedReader, JOptionPane. Pada scanner sebelum deklarasi class kita harus mengimportnya terlebih dahulu dengan syntax import java.util.scanner; dan untuk mendeklarasikan penggunaan kelas scanner menggunakan syntax Scanner BacaInput = new Scanner(System.in); dimana BacaInput adalah suatu variabel bertipe Scanner dan new Scanner(System.in) adalah syntax yang bertujuan untuk menciptakan suatu objek bertipe scanner. Pada BufferedReader sebelum deklarasi class kita harus mengimportnya terlebih dahulu dengan syntax import java.io.BufferedReader;, java.io.InputStreamReader;, dan java.io.IOException; dan untuk mendeklarasikan penggunaan kelas BufferedReader menggunakan syntax BufferedReader DataMasuk = new BufferedReader (new InputStreamReader(System.in)); setelah mendeklarasikannya perlu method Nama = DataMasuk.readLine(); untuk membaca inputan dari keyboard. Pada JOptionPane sebelum deklarasi class kita harus mengimportnya terlebih dahulu dengan syntax import javax.swing.JOptionPane; dan untuk mendeklarasikan penggunaan kelas JOptionPane menggunakan syntax Nama = JOptionPane.showInputDialog("Silahkan Masukan Nama Anda"); dimana Syntax tersebut akan menampilkan dialog dengan sebuah pesan, sebuah texftile dan tombol OK. dan hasil dari dialog tersebut adala String dan disimpan kedalam variabel Nama kemudian untuk menampilkan pesan selanjutnya menggunakan String msg = "Hallo" + "Nama + "!" kemudian tambahkan Syntax JOptionPane.ShowMessageDialog (null, msg); syntax ini digunakan untuk menampilkan sebuah dialog yang memiliki sebuah pesan dan tombol OK.
