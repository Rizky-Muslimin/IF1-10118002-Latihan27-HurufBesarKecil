/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118002.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 * Nama      : Rizky Muslimin
 * Kelas     : IF-1
 * NIM       : 10118002
 * Deskripsi : Huruf besar dan kecil
 */
public class IF110118002Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String kalimat;

        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        kalimat = masuk.nextLine();
        String Kapital = kalimat.toUpperCase();
        String Kecil = kalimat.toLowerCase();

        System.out.println("====Hasil Formatting====");
        System.out.printf("Huruf Besar\t: %s", Kapital);
        System.out.printf("%nHuruf Kecil\t: %s%n", Kecil);
    }
   
}

