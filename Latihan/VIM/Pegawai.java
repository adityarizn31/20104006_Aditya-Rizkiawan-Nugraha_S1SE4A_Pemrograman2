package Modul8.Latihan.VIM;

public class Pegawai {

    private String name;
    private String address;
    private int number;
    private double salary;


    public Pegawai(String name, String address,  int number, double salary) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.salary = salary;
    }


    public void MailCheck() {
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Surat tertuju untuk " + this.name + " dengan gaji " + salary);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddres) {
        address = newAddres;
    }

    public int getNumber() {
        return number;
    }

    public double getSalary() {
        return salary;
    }
}
