import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        // Meminta pengguna memasukkan kata atau frase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Menghapus spasi dan mengubah ke huruf kecil untuk mempermudah pengecekan
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Memanggil metode untuk mengecek apakah kata atau frase adalah palindrom
        if (isPalindrom(cleanedInput)) {
            System.out.println("\"" + input + "\" adalah palindrom.");
        } else {
            System.out.println("\"" + input + "\" bukan palindrom.");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata atau frase adalah palindrom
    public static boolean isPalindrom(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}