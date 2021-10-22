package Modul2.Latihan;

import java.util.Scanner;

public class Anak_Ayam {
    public static void main(String[] args) {
        Scanner asupkeun = new Scanner(System.in);

        int anakayam, ayam;

        System.out.print("MASUKAN JUMLAH ANAK AYAM = ");
        anakayam = asupkeun.nextInt();

        for (ayam = anakayam; ayam > 1; ayam--){
            System.out.println("ANAK AYAM TURUN " + anakayam);
            anakayam = ayam - 1;
            System.out.println("MATI SATU TINGGAL " + anakayam);
        }
        System.out.println("ANAK AYAM TURUN 1, MATI 1 TINGGAL INDUKNYA ");
    }
}
