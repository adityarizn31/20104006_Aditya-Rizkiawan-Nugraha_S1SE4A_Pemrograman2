package Modul7.Latihan;

public class Rektor extends Dosen{
    private int th_mulai;
    public int jabatan;

    Rektor(String namx, String nikx, String jurx, int thx, int kex) {
        super(namx, nikx, jurx);
        this.th_mulai = thx;
        this.jabatan = kex;
    }

    public void tampil() {

        super.tampil();
        System.out.println("\nTahun mulai jabatan\t= " + th_mulai);
        System.out.println("Jabatan ke \t\t\t=- " + jabatan);
    }
}
