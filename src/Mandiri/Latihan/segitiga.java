package Mandiri.Latihan;

import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, asciiChar = 97;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) asciiChar);
                asciiChar++;
            }
            for (int l = 0; l < (i-1); l++) {
                System.out.print((char) asciiChar);
                asciiChar++;
            }
            System.out.println();
        }
    }
}
