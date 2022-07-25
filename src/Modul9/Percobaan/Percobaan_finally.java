package Modul9.Percobaan;

public class Percobaan_finally {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi exception karena indeks melebih batas");
        } finally {
            System.out.println("Selalu dijalankan");
        }
        System.out.println("Setelah blok try-catch");
    }
}
