package Mandiri.Latihan;

import java.util.Scanner;

public class rekapPenjualan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahProduk, jumlahHari, jumlahTerjual, totalPenjualanSemuaProduk = 0, totalPerProduk;

        System.out.print("Masukkan jumlah produk: ");
        jumlahProduk = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        jumlahHari = sc.nextInt();

        if (jumlahHari < 1 || jumlahProduk < 1) {
            System.out.println("Minimal nilai jumlah hari dan jumlah produk adalah 1");
            return;
        }

        int i = 1;
        while (i <= jumlahProduk) {
            totalPerProduk = 0;
            for (int j = 1; j <= jumlahHari; j++) {
                do {
                    System.out.println("Input tidak boleh negatif");
                    System.out.printf("Masukkan jumlah terjual produk %d hari ke-%d: ", i, j);
                    jumlahTerjual = sc.nextInt();
                } while (jumlahTerjual < 0);
                totalPenjualanSemuaProduk += jumlahTerjual;
                totalPerProduk += jumlahTerjual;
            }
            System.out.println(String.format("\nTotal penjualan produk %d dalam %d hari: %d", i, jumlahHari, totalPerProduk));
            System.out.println(String.format("Rata-rata penjualan produk %d dalam %d hari: %.2f\n", i, jumlahHari, ((double) totalPerProduk/jumlahHari)));

            i++;
        }
        System.out.println(String.format("Total penjualan seluruh produk dalam %d hari: %d", jumlahHari, totalPenjualanSemuaProduk));
    }
}
