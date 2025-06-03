import java.util.Scanner;

public class Array2DInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menentukan ukuran array 2D
        System.out.print("Masukkan jumlah baris: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = scanner.nextInt();

        int[][] array = new int[baris][kolom];

        // Memasukkan elemen array
        System.out.println("\nMasukkan elemen array:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Array[" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Menampilkan isi array
        System.out.println("\nIsi array 2D:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
