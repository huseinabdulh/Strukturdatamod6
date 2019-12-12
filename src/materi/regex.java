/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materi;

/**
 *
 * @author ASUS RYZEN
 */
public class regex {

    public static void main(String[] args) {
        //deklarasi kalimat
        String kalimat = "Universitas Muhammadiyah Malang";

        //mencocokkan nilai dengan nilai yg teah didefinisikan
        boolean kondisi1 = kalimat.matches("Universitas Muhammadiyah Malang");
        boolean kondisi2 = kalimat.matches("U M M");
        
        //tampilkan
        System.out.println("kondisi 1 ="+kondisi1);
        System.out.println("kondisi 2 = "+kondisi2);

    }
}
