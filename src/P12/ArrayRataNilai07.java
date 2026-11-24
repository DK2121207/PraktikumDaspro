// P = 07
// Percobaan 3 (uji wajib tambahan) ==> 30 + (P mod 71) = 30 + (7 mod 71) = 37
package P12;

import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiMhs;
        int arrayLength;
        int total = 0;
        int banyakLulus = 0;
        double rata2;

        do {
            System.out.print("Input banyak elemen array: ");
            arrayLength = input.nextInt();
            if (arrayLength == 0) {
                System.out.println("Banyak elemen array minimal 1");
            }
        } while (arrayLength == 0);
        nilaiMhs = new int[arrayLength];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                banyakLulus++;
            }
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        String predikatKelas = (rata2 >= 85) ? "SANGAT BAIK" : (rata2 >= 70) ? "BAIK" : "PERLU PENDAMPINGAN";
        System.out.println("Predikat kelas: " + predikatKelas);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah)
                terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyak mahasiswa yang lulus: " + banyakLulus);
    }
}
