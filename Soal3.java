import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan nilai n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        // Menampilkan deret Fibonacci hingga suku ke-n
        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Menutup scanner
        scanner.close();
    }

    // Fungsi untuk menghitung nilai suku ke-n dalam deret Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}