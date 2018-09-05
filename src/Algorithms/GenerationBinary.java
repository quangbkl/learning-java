package Algorithms;

public class GenerationBinary {
    public static void printBinary(int[] arr) {
        for (int item : arr) System.out.print(item);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] binary = new int[5];
        int length = binary.length;
        for (int i = 0; i < length; i++) binary[i] = 0;

        while (true) {
            printBinary(binary);
            int pos = length;

            while (pos > 0 && binary[pos - 1] == 1) {
                pos--;
                binary[pos] = 0;
            }
            
            if (pos <= 0) break;
            binary[pos - 1] = 1;
        }
    }
}