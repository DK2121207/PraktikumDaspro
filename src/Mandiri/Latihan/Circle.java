package Mandiri.Latihan;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;

        System.out.print("Masukkan radius lingkaran: ");
        r = sc.nextInt();

        for (int x = -r; x < (r + 1); x++) {
            for (int y = -r; y < (r + 1); y++) {
                // System.out.print("#");
                if (Math.abs((x*x) + (y*y) - (r*r)) <= (r - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                // if ((x*x + y*y) == r*r || (x*x + y*y) == (r*r - 1) || (x*x + y*y) == (r*r - 2) || (x*x + y*y) == (r*r - 3) || (x*x + y*y) == (r*r - 4) || (x*x + y*y) == (r*r - 5) || (x*x + y*y) == (r*r - 6)
                //     ||
                //     (x*x + y*y) == (r*r + 1) || (x*x + y*y) == (r*r + 2) || (x*x + y*y) == (r*r + 3) || (x*x + y*y) == (r*r + 4) || (x*x + y*y) == (r*r + 5) || (x*x + y*y) == (r*r + 6)) {
                //     System.out.print("*");
                // } else {
                //     System.out.print(" ");
                // }
            }
            System.out.println();
        }
    }
}
