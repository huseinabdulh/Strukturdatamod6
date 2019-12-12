/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keg2;

import java.util.regex.Pattern;

/**
 *
 * @author ASUS RYZEN
 */
public class main {

    public static void main(String[] args) {
        String kalimat1 = "Hatiku sungguh senang sekali";
        String kalimat2 = "Pukulan yang sangat keras";
        String kalimat3 = "Kalau berjalan hati – hati";

        String key = ".*hati.*";

        boolean kondisi1 = Pattern.matches(key, kalimat1.toLowerCase());
        boolean kondisi2 = Pattern.matches(key, kalimat2.toLowerCase());
        boolean kondisi3 = Pattern.matches(key, kalimat3.toLowerCase());

        System.out.println("Kondisi Pertama : " + kondisi1);
        System.out.println("Kondisi Kedua   : " + kondisi2);
        System.out.println("Kondisi Ketiga  : " + kondisi3);
    }

}
