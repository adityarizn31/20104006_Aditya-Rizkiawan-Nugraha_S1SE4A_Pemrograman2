package Modul8.Latihan;

public class Tes2 {
    public static void Proses(Pegawai peg) {
        if (peg instanceof Manajer) {
            System.out.println("Melakukan Tugas - tugas Manajer");
        } else if (peg instanceof Kurir) {
            System.out.println("Melakukan tugas tugas kurir");
        } else {
            System.out.println("Melakukan tugas lainnya");
        }
    }

    public static void main(String[] args) {
        Manajer man = new Manajer();
        Kurir kur = new Kurir();
        Proses(man);
        Proses(kur);
    }
}
