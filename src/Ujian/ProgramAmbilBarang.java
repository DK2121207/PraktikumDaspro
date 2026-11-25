package Ujian;

public class ProgramAmbilBarang {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+i + "," + j);
                if (i == 0 && j == 1) {
                    System.out.print(" ---  " + i + "," + j + " ambil kaleng" + "  ---  ");
                    break;
                    // continue;
                    // System.out.println("ada kaleng");
                } else if (i == 1 && j == 3) {
                    System.out.print(" ---  " + i + "," + j + " ambil gelas" + "  ---  ");
                    break;
                    // continue;
                } else if (i == 2 && j == 2) {
                    System.out.print(" ---  " + i + "," + j + " ambil kulit pisang" + "  ---  ");
                    break;
                    // continue;
                } else if (i == 3 && j == 0) {
                    System.out.print(" ---  " + i + "," + j + " ambil daun kering" + "  ---  ");
                    break;
                    // continue;

                }
            }
            // System.out.println();
        }
    }
}
