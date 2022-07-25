package Modul8.Latihan.VIM;

public class Demo {

    public static void main(String[] args) {

        Gaji s = new Gaji("Aditya", "Majalengka", 1, 80000);

        Pegawai e = new Pegawai("Fadli", "Kadipaten", 2, 25000);

        System.out.println("\nMemanggil mailcheck berdasarkan referensi Gaji--");

        s.MailCheck();

        System.out.println("\nMemanggil mailcheck berdasarkan referensi Pegawai--");

        e.MailCheck();


    }
}
