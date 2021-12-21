package Modul9.Percobaan;

public class Percobaan22 {
    public static void main(String[] args) {
        int bil = 10;

        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException A) {
            System.out.println("Bilangan tidak boleh dibagian dengan angka 0");
        }
    }
}
