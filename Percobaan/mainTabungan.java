package Modul4.Percobaan;

public class mainTabungan {
    public static void main(String[] args) {
        Tabungan rizkiawan = new Tabungan("Barca", 123456);
        Tabungan nugraha = new Tabungan("Manu", 12467, 15000, 9898);


        rizkiawan.setSaldo(10000); // digunakan mengisi nilai tanpa mengembalikan nilai
        rizkiawan.setPin(11111); //


        System.out.println("Saldo awal Rizkiawan \t : " + rizkiawan.getSaldo());
        System.out.println("Saldo awal Nugraha \t\t : " + nugraha.getSaldo());
        System.out.println("Nomor pin Rizkiawan \t : " + rizkiawan.getPin());
        System.out.println("Nomor pin Nugraha \t\t : " + nugraha.getPin());
    }
}
