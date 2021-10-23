package Modul2.Latihan;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner asupkeun = new Scanner(System.in);
        int t;
        int[] a, b, c;

        System.out.print("MASUKAN JUMLAH TESTCASE\t: ");
        t = asupkeun.nextInt();
        a = new int[t];
        b = new int[t];
        c = new int[t];

        for (int i = 0; i < t; i++) {
            System.out.print("\nMASUKAN A" + (i + 1) + "\t: ");
            a[i] = asupkeun.nextInt();
            System.out.print("MASUKAN B" + (i + 1) + "\t: ");
            b[i] = asupkeun.nextInt();
            System.out.print("MASUKAN C" + (i + 1) + "\t: ");
            c[i] = asupkeun.nextInt();
        }

        for (int i = 0; i < t; i++) {
            System.out.print("\nA" + (i + 1) + " + B" + (i + 1) + " - C" + (i + 1) + " = ");
            System.out.println(a[i] + b[i] - c[i]);
        }
    }
}
