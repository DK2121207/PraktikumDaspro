package P12;

import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };
        int[] indexPesanan;
        int indexPesananLength;
        int indexPilihan;
        int pilihan;
        int totalBiaya;
        String searchKey;
        boolean status = false;

        while (true) {
            System.out.println("=====Fitur=====\n1. Cari menu\n2. Pesan menu\n3. Exit");

            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();

/* pilihan 1 */
            if (pilihan == 1) {
                System.out.print("Masukkan nama menu yang dicari: ");
                sc.nextLine();
                searchKey = sc.nextLine();

                status = false;
                for (int i = 0; i < menu.length; i++) {
                    if (menu[0].equalsIgnoreCase(searchKey)) {
                        System.out.println("Menu " + searchKey + " ditemukan, harganya " + harga[i] + "\n");
                        status = true;
                        break;
                    }
                }

                if (!status) {
                    System.out.println("Menu " + searchKey + " tidak ditemukan di daftar menu.\n");
                }

/* pilihan 2 */
            } else if (pilihan == 2) {
                
                do {
                    System.out.print("Masukkan banyak pesanan: ");
                    indexPesananLength = sc.nextInt();
                    if (indexPesananLength < 1) {
                        System.out.println("Banyak pesanan minimal 1");
                    }
                } while (indexPesananLength < 1);
                indexPesanan = new int[indexPesananLength];
                
                System.out.println("=====Daftar Menu=====");
                for (int i = 0; i < menu.length; i++) {
                    System.out.printf("%d. %s\n", (i+1), menu[i]);
                }

                for (int i = 0; i < indexPesanan.length; i++) {
                    do {
                        System.out.printf("Masukan kode menu (1-%d): ", menu.length);
                        indexPilihan = sc.nextInt();
                        if (indexPilihan < 1 || indexPilihan > menu.length) {
                            System.out.println("Kode tidak valid, tidak ada di daftar menu");
                        }
                    } while (indexPilihan < 1 || indexPilihan > menu.length);
                    indexPesanan[i] = (indexPilihan - 1);
                }

                totalBiaya = 0;
                for (int i : indexPesanan) {
                    totalBiaya += harga[i];
                }

                System.out.println("==========");
                System.out.printf("No %15s %15s\n", "Pesanan", "Harga");
                for (int i = 0; i < indexPesanan.length; i++) {
                    System.out.printf("%d. %15s %15d\n", (i+1), menu[indexPesanan[i]], harga[indexPesanan[i]]);
                }
                System.out.println("==========");
                System.out.println("Total Biaya: " + totalBiaya + "\n");

/* pilihan 3 */ 
            } else if (pilihan == 3) {
                System.out.println("Keluar dari aplikasi");
                break;
            }
        }

    }
}
