// P = 7
// Percobaan 1 (uji tambahan, langkah 10) ==> 3 + (P mod 5) = 3 + (7 % 5) = 5
// Percobaan 1 (uji tambahan, langkah 10) ==> 9 + (P mod 5) = 9 + (7 % 5) = 11
// Percobaan 1 (Pertanyaan 1 & 2) ==> 4 + (P mod 4) = 4 + (7 % 4) = 7
// Percobaan 1 (Pertanyaan 3) ==> 10 + (P mod 6) = 10 + (7 % 6) = 11
package P10;

import java.util.Scanner;

public class Star07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
