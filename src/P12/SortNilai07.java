// P = 07
// Percobaan 4 Bagian B (uji wajib tambahan) ==> 20 + (P mod 60) = 20 + (7 mod 60) = 27
package P12;

public class SortNilai07 {
    public static void main(String[] args) {
        int B = 27;
        // int[] nilai = { 78, 65, 90, 55, 88, 72 };
        int[] nilai = {B, B+15, B-8, B+30, B-20, B+5};
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] < nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        System.out.print("{ ");
        for (int i : nilai) {
            System.out.print(i + " ");
        }
        System.out.print("}");
    }
}
