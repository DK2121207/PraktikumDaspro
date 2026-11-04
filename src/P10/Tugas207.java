package P10;

import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, jumlahSemuaAngka = 0;

        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", (i*j));
                jumlahSemuaAngka += i * j;
            }
            System.out.println();
        }

        System.out.println("Jumlah seluruh angka: " + jumlahSemuaAngka);
    }
}
