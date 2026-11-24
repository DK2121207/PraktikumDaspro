// P = 07
// Percobaan 4 Bagian A (uji wajib tambahan) ==> 50 + (P mod 50) = 50 + (7 mod 50) = 57
// Percobaan 4 Bagian B (uji wajib tambahan) ==> 20 + (P mod 60) = 20 + (7 mod 60) = 27
package P12;

public class SearchNilai07 {
    public static void main(String[] args) {
        int[] nilai = { 78, 65, 90, 55, 88, 72 };
        int key = 57;
        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan.");
        }
    }
}
