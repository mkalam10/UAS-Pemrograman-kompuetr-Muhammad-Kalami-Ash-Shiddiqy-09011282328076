import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan bilangan bulat positif
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Menampilkan faktorisasi bilangan
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        // Menutup scanner
        scanner.close();
    }

    // Fungsi untuk melakukan faktorisasi bilangan
    public static void faktorisasi(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}