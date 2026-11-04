package Mandiri.Latihan;

import java.util.Scanner;

public class jumlahKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, jumlah = 0;

        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        System.out.print("n = " + n + " -> jumlah kuadrat = ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i*i + " ");
            if (i != n) {
                System.out.print("+ ");
            }
            jumlah += i*i;
        }
        System.out.println("= "+jumlah);
    }
}
