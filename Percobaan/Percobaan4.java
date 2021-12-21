package Modul9.Percobaan;

public class Percobaan4 {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            System.out.println("Acces element three " + a[3]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        }
        finally {
            a[0] = 6;
            System.out.println("First element value : " + a[0]);
            System.out.println("The Finally statement is esceuted ");
        }
    }
}
