// P = 07
// Percobaan 4 Bagian A (uji wajib tambahan) ==> 50 + (P mod 50) = 50 + (7 mod 50) = 57
// Percobaan 4 Bagian B (uji wajib tambahan) ==> 20 + (P mod 60) = 20 + (7 mod 60) = 27
package P12;

import java.util.Scanner;

public class SearchNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] nilai = { 78, 65, 90, 55, 88, 72 };
        int[] nilai;
        int arrayLength;
        int key;
        boolean ditemukan = false;

        do {
            System.out.print("Masukan banyak elemen array: ");
            arrayLength = sc.nextInt();
            if (arrayLength == 0) {
                System.out.println("Banyak elemen array minimal 1");
            }
        } while (arrayLength == 0);
        nilai = new int[arrayLength];

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Masukkan nilai index ke-%d: ", i);
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang akan dicari didalam array: ");
        key = sc.nextInt();

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan didalam array.");
        }
    }
}
