/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keg1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS RYZEN
 */
public class main {

    public static void main(String[] args) {
        Scanner bf = new Scanner(System.in);
        String regex = "kucing";
        String inputan = "kucing itu bercuit," + "semua kucing bercuit.";

        String replace = "burung";
        String replacefix;

        String regexreal = ".*"+regex+".*";
        if (Pattern.matches(regexreal, inputan) == true) {
            System.out.print("Masukkan Kata untuk me-replace regex : ");
            replacefix = bf.nextLine();
            replace = inputan.replaceAll(regex, Matcher.quoteReplacement(replacefix));
        } else {
            System.out.println("Regex tidak cocok!");

        }

        System.out.println("kalimat sebelum: " + inputan);
        System.out.println("Output : " + replace);
    }

}
