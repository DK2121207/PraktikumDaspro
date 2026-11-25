package Ujian;

import java.util.Scanner;

public class NilaiMhs_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, tambahMahasiswa, status;
        int kuis, uts, uas, tugas, jumlahMahasiswa = 0, jumlahLulus = 0, jumlahTidakLulus = 0;
        double rataTugas, nilaiAkhir;

        do {
            jumlahMahasiswa++;
            System.out.print("Nama Mahasiswa: ");
            namaMahasiswa = sc.nextLine();
            System.out.print("Nilai Kuis: ");
            kuis = sc.nextInt();
            System.out.print("Nilai UTS: ");
            uts = sc.nextInt();
            System.out.print("Nilai UAS: ");
            uas = sc.nextInt();
            rataTugas = 0;
            for (int i = 1; i <= 2; i++) {
                while (true) {
                    System.out.printf("Nilai Tugas %d: ", i);
                    tugas = sc.nextInt();
                    if (tugas < 0 || tugas > 100) {
                        System.out.println("Nilai tidak valid, ulangi!");
                        continue;
                    }
                    rataTugas += tugas;
                    break;
                }

            }
            rataTugas /= 2;
            nilaiAkhir = 0.35*kuis + 0.15*uts + 0.30*uas + 0.20*rataTugas;

            System.out.println("Rata-rata tugas\t: " + rataTugas);
            System.out.println("Nilai Akhir\t: " + nilaiAkhir);
            if (nilaiAkhir > 50) {
                jumlahLulus++;
                status = "LULUS";
            } else {
                jumlahTidakLulus++;
                status = "TIDAK LULUS";
            }
            System.out.println("Status\t\t: " + status);

            System.out.print("Tambah mahasiswa? (y/t): ");
            sc.nextLine();
            tambahMahasiswa = sc.nextLine();
            System.out.println();
        } while (tambahMahasiswa.equalsIgnoreCase("y"));

        System.out.println("===== REKAP =====");
        System.out.println("Jumlah mahasiswa\t: " + jumlahMahasiswa);
        System.out.println("Jumlah lulus\t\t: " + jumlahLulus);
        System.out.println("Jumlah tidak lulus\t: " + jumlahTidakLulus);
    }
}
