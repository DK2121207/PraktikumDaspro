// P = 7
// Tugas 1 (uji wajib) ==> 6 + (P mod 5) = 6 + (7 % 5) = 8
package P10;

import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, angkaTercetak = 0;
        
        System.out.print("Masukkan nilai n = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                angkaTercetak++;
            }
            System.out.println();
        }

        System.out.println("Total angka tercetak = " + angkaTercetak);
    }
}
