package Modul9.Percobaan;

public class Percobaan_trycatch {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[5] = 100;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebih batas");
        }
        System.out.println("Setelah blok try-catch");
    }
}
