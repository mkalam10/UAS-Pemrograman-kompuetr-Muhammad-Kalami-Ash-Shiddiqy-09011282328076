import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
       // Menampilkan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        // Meminta pengguna memilih operasi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor operasi: ");
        int pilihan = scanner.nextInt();
        
        // Meminta pengguna memasukkan dua bilangan
        
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

     

        // Melakukan operasi sesuai pilihan pengguna
        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + penjumlahan(bilangan1, bilangan2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + pengurangan(bilangan1, bilangan2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + perkalian(bilangan1, bilangan2));
                break;
            case 4:
                System.out.println("Hasil pembagian: " + pembagian(bilangan1, bilangan2));
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk penjumlahan
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public static double pengurangan(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    public static double perkalian(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    public static double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak valid.");
            return Double.NaN; // NaN (Not a Number) sebagai hasil pembagian tidak valid
        }
    }
}