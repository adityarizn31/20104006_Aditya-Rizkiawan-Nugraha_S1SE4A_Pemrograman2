package Modul7.Latihan;

public class Dosen {
    public String nama;
    public String nik;
    public String jurusan;

    Dosen(String namx, String nikx, String jurx) {
        this.nama = namx;
        this.nik = nikx;
        this.jurusan = jurx;
    }

    public void tampil() {
        System.out.println("\nNama \t= " + nama);
        System.out.println("Nim \t= " + nik);
        System.out.println("Jurusan = " + jurusan);
    }
}
