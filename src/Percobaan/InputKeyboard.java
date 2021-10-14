package Percobaan;

import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner asupkeun = new Scanner(System.in);

        int var_a;
        int var_b;
        System.out.println("MASUKAN NILAI VAR_A = ");
        var_a = asupkeun.nextInt();

        System.out.println("MASUKAN NILAI VAR_B = ");
        var_b = asupkeun.nextInt();

        System.out.println("=== VARIABEL YANG TERDAPAT DALAM PROGRAM === ");
        System.out.println("VAR_A = " + var_a);
        System.out.println("VAR_B = " + var_b);


    }
}
