// P = 07
// Percobaan 1 (uji wajib tambahan) ==> P=7; P+8=15; −(1+(P mod 7))-1; 20+(P mod 15)=27
package P12;

public class ArrayBilangan07 {
    public static void main(String[] args) {
        int P = 7;
        int[] bil = new int[4];

        bil[0] = P;
        bil[1] = P+8;
        bil[2] = -(1+(P % 7));
        bil[3] = 20+(P % 15);

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
    }
}
