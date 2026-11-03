// P = 7
// Percobaan 2 (uji tambahan, langkah 9) ==> (2 + (P mod 3), 4 + (P mod 3))
// 2 + (P mod 3) = 2 + (7 % 3) = 3
// 4 + (P mod 3) = 4 + (7 % 3) = 5
// Percobaan 2 (uji tambahan, langkah 9) ==> (5 + (P mod 3), 2 + (P mod 3))
// 5 + (P mod 3) = 5 + (7 % 3) = 6
// 2 + (P mod 3) = 2 + (7 % 3) = 3
// Percobaan 2 (Pertanyaan 2) ==> 4 + (P mod 4), 6 + (P mod 4)
// 4 + (P mod 4) = 4 + (7 % 4) = 7
// 6 + (P mod 4) = 6 + (7 % 4) = 9
package P10;

import java.util.Scanner;

public class Rectangle07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = sc.nextInt();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
