// P = 07
// Tugas 1 (uji wajib) ==> 5 + (P mod 11) = 5 + (7 mod 11) = 12
// Tugas 1 (uji wajib) ==> P mod 100 = 7 mod 100 = 7
package P12;

import java.util.Scanner;

public class Tugas107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai;
        int arrayLength;
        int totalNilai = 0, rataNilai = 0, tertinggi, terendah;
        String status;

        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
            arrayLength = sc.nextInt();
            if (arrayLength == 0) {
                System.out.println("Banyaknya nilai mahasiswa yang akan diinput minimal 1");
            }
        } while (arrayLength == 0);
        nilai = new int[arrayLength];

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Masukkan nilai mahasiswa ke-%d: ", (i+1));
            nilai[i] = sc.nextInt();
            totalNilai+=nilai[i];
        }

        rataNilai = totalNilai/arrayLength;
        System.out.println("Rata-rata nilai mahasiswa: " + rataNilai);

        tertinggi = nilai[0];
        terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        for (int i = 0; i < nilai.length; i++) {
            status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.printf("Nilai mahasiswa ke-%d: %d (%s)\n", (i+1), nilai[i], status);
        }
    }
}
