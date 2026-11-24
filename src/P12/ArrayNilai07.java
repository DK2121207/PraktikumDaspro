// P = 07
// Percobaan 2 (uji wajib tambahan) ==> 60 + (P mod 41)=67
package P12;

import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     // String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
        //     // System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" +
        //     //         status + ")");
        //     if (nilaiAkhir[i] > 70) {
        //         System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
        //     }
        // }
        
        int counter = 1;
        int lulus = 0, tidakLulus = 0;
        for (int i : nilaiAkhir) {
            if (i > 70) {
                System.out.println("Mahasiswa ke-" + counter + ": " + i + " (LULUS)");
                lulus++;
            }
            else {
                tidakLulus++;
            }
            counter++;
        }
        System.out.println("Jumlah lulus: " + lulus);
        System.out.println("Jumlah tidak lulus: " + tidakLulus);
    }
}
