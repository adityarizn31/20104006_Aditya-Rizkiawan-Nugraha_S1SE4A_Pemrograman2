package Modul5.Percobaan.Sekolah;

import Modul5.Percobaan.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahasiswa;

    public Kelas (int kode, String nama){
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void SetMhs(Mahasiswa mhs){
        this.mahasiswa = mhs;
    }
}
