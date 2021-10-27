package Modul3.Latihan;

public class TestTabungann {
    public static void main(String args[]) {
        boolean status;
        Tabungan tabungan = new Tabungan(10000);

        System.out.println("SALDO AWAL : " + tabungan.getSaldo());
        tabungan.simpanUang(8000);

        System.out.println("JUMLAH UANG YANG DISIMPAN : 8000");
        status = tabungan.ambilUang(7000);

        System.out.print("JUMLAH UANG YANG DIAMBIL : 7000");
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" GAGAL");
        }
        tabungan.simpanUang(1000);
        System.out.println("JUMLAH UANG YANG DISIMPAN : 1000");
        status = tabungan.ambilUang(10000);
        System.out.print("JUMLAH UANG YANG DIAMBIL :  10000");
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" GAGAL");
        }
        status = tabungan.ambilUang(2500);
        System.out.print("JUMLAH UANG YANG DIAMBIL : 2500");
        if (status) {
            System.out.println(" OK");
        } else {
            System.out.println(" GAGAL");
        }
        tabungan.simpanUang(2000);
        System.out.println("JUMLAH UANG YANG DISIMPAN : 2000");
        System.out.println("SALDO SEKARANG = " + tabungan.getSaldo());
    }

}
