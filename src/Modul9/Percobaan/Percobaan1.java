package Modul9.Percobaan;

public class Percobaan1 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            a[4] = 100;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks Array melebihi batas");
        }
        System.out.println("Setelah blok try-catch");
    }
}
