// Tugas 3 (uji wajib) ==> 2 + (P mod 3) = 2 + (7 % 3) = 3
package P10;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko, counterPerlanggan, totalBarang, totalBarangSemuaToko = 0, barang, tokoPenjualanTertinggi = 0, penjualanTertinggi = -1;
        System.out.print("Masukkan jumlah toko = ");
        jumlahToko = sc.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("Jumlah toko minimal 1");
            return;
        }

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.println("Toko ke-" + i);
            System.out.println("Masukkan angka negatif untuk berhenti input barang");
            counterPerlanggan = 0;
            totalBarang = 0;
            
            while (true) {
                System.out.print("Pembelian barang pelanggan ke-" + (counterPerlanggan+1) + " = ");
                barang = sc.nextInt();
                if (barang < 0) {
                    System.out.println("Selesai input barang");
                    break;
                }
                counterPerlanggan++;
                totalBarang += barang;
            }

            totalBarangSemuaToko += totalBarang;
            if (totalBarang > penjualanTertinggi) {
                penjualanTertinggi = totalBarang;
                tokoPenjualanTertinggi = i;
            }
            System.out.println(String.format("Toko %d - pelanggan: %d, total barang: %d\n", i, counterPerlanggan, totalBarang));
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoPenjualanTertinggi);
    }
}
