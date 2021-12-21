package Modul9.Latihan;

import java.util.Scanner;

public class Melempar_UncheckedException {
    public static void main(String[] args) {
        Scanner asupkeun = new Scanner(System.in);

        try {
            System.out.println("Masukan angka = ");
            int nilai = asupkeun.nextInt();

            if (nilai > 10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s) {
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");

        }
    }
}
