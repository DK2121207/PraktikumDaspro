package Mandiri;

public class ArrayLeeeee {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6};
        int[] teller1 = new int[data.length/2];
        int[] teller2 = new int[data.length/2];

        for (int i = 0; i < data.length/2; i++) {
            teller1[i] = data[i];
            teller2[i] = data[i+data.length/2];
        }

        for (int i : data) {
            System.out.println("data " + i);
        }
        
        for (int i : teller1) {
            System.out.println("teller1 " + i);
            
        }
        for (int i : teller2) {
            System.out.println("teller2 " + i);
            
        }
    }
}
