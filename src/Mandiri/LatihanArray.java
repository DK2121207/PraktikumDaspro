package Mandiri;

import java.util.Scanner;

public class LatihanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[2];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Masukkan nilai array ke-%d: ", i);
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Elemen ke-%d: %d\n", i, array[i]);
        }
    }
}
