package P10;

import java.util.Scanner;

public class ConvertStudiKasus307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahTerjual;
        int jumlahProduk = 3, jumlahHari = 4, totalPerProduk = 0, totalPenjualan = 0, totalPerHari = 0;
        
        for (int i = 0; i < jumlahProduk; i++) {
                for (int j = 0; j < jumlahHari; j++) {
                
                System.out.print("Masukkan jumlah terjual: ");
                jumlahTerjual = sc.nextInt();
                totalPerProduk += jumlahTerjual;
            }
        
            System.out.println("Jumlah produk terjual untuk Produk ke-" + (i+1) + " adalah: " + totalPerProduk);
            totalPenjualan += totalPerProduk;
            totalPerProduk = 0;
        }
        System.out.println("Total penjualan semua produk adalah: " + totalPenjualan);
        
        // for (int j = 0; j < jumlahHari; j++) {
        //     System.out.println("Masukkan jumlah terjual hari ke-" + (j+1));
        //     for (int i = 0; i < jumlahProduk; i++) {
        //         System.out.print("Masukkan jumlah terjual produk ke-" + (i+1) + " : ");
        //         jumlahTerjual = sc.nextInt();
        //         totalPerHari += jumlahTerjual;
        //     }
        //     System.out.println("Penjualan hari ke-" + (j+1) + " : " + totalPerHari);
        //     // totalPenjualan
        // }
    }
}
