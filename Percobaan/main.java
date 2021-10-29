package Modul4.Percobaan;

public class main {
    public static void main(String[] args) {

        Tabungan aditya = new Tabungan("Barca",50410420,1000000,4669);
        // Membuat objek dari tabungan dengan variabel aditya

        System.out.println("Nama \t : " + aditya.getNama());
        System.out.println("No Rekening \t : " + aditya.getNoRekening());
        System.out.println("Saldo \t : " + aditya.getSaldo());
        System.out.println("Pin \t :  " + aditya.getPin());
    }
}
