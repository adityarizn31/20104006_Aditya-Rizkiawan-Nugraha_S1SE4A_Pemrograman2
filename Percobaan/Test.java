package Modul3.Percobaan;

public class Test {
    public static void main(String[] args) {
        Rumah r = new Rumah(); // membuat object dari blueprint rumah
        r.setAlamat_rumah("Alamat saya di jalan Lapang Sari");
        System.out.println(r.alamat_rumah);
    }
}
