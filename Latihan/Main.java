package Modul7.Latihan;

public class Main {
    public static void main(String[] args) {
        Dosen dos;
        //Dosen dosen = new Dosen("Nugraha", "20104016", "RPL");
        Rektor rek = new Rektor("Aditya", "20104006", "Rekayasa Perangkat Lunak", 2020, 1);
        Dekan dek = new Dekan("Rizkiawan", "20114006", "Teknik Informatika", "IT");

        dos = rek;
        dos.tampil();

        dos = dek;
        dos.tampil();

        //dos = dosen;
        //dos.tampil();
    }
}
