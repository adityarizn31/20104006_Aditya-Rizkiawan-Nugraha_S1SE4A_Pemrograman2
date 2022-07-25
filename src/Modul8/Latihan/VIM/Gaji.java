package Modul8.Latihan.VIM;

public class Gaji extends Pegawai{

    private double salary; // Gaji Tahunan

    public Gaji(String name, String address, int number, double salary ) {
        super(name, address, number, salary);
        this.salary = salary;
        System.out.println("Menyusun Pegawai");
    }

    public void MailCheck() {
        System.out.println("Memeriksa Kelas gaji dalam Surat ");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >=0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Menghitung pembayaran gaji untuk " + getName());
        return salary/52;
    }
}
