/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS RYZEN
 */
public class main {

    public static void main(String[] args) {

        String kalimat, kata, replace;

        Scanner input = new Scanner(System.in);
        System.out.println("--KEGIATAN 1--");
        System.out.println("Masukkan kalimat:");
        kalimat = input.nextLine();

        System.out.println("Masukkan kata yang ingin di ganti:");
        kata = input.nextLine();

        System.out.println("Masukkan kata penggantinya:");
        replace = input.nextLine();
        
        // tanda \\b merupakan batasan kecocokan data
        String key = "\\b" + kata + "\\b";
        String hasil = kalimat.replaceAll(key, replace);//mengubah karakter lama ke karakter baru
        System.out.println("Kata- kata : " + hasil);

        System.out.println("--KEGIATAN 2--");
        String kalimat1 = "Hatiku sungguh senang sekali";
        String kalimat2 = "Pukulan yang sangat keras";
        String kalimat3 = "Kalau berjalan hati - hati";
        
        //String kataKunci = ".*hati.*"; //"^.*(?i)hati.*$"
        //String pola = "^.*(?i)"+kataKunci+".*$";//menghiraukan tanda capslock
        String key2 = "(?i:.*hati.*)";
        System.out.println(kalimat1.matches(key2));//pengganti bolean
        System.out.println(kalimat2.matches(key2));
        System.out.println(kalimat3.matches(key2));
    }
}
