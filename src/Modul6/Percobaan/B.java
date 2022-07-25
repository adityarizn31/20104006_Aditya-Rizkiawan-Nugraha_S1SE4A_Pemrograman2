package Modul6.Percobaan;

public class B extends A {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }


    public void getJumlah() {
        System.out.println("Jumlah = " + (x + y + z));
    }
}
