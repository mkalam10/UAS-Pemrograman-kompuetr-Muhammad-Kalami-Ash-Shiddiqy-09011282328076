import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        double totalHarga = 0;

        if (jumlahBarang < 5) {
            totalHarga = hargaBarang * jumlahBarang;
        } else if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            double diskon = 0.05;
            totalHarga = (hargaBarang * jumlahBarang) * (1 - diskon);
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            double diskon = 0.1;
            totalHarga = (hargaBarang * jumlahBarang) * (1 - diskon);
        } else if (jumlahBarang > 20) {
            double diskon = 0.2;
            totalHarga = (hargaBarang * jumlahBarang) * (1 - diskon);
        }

        System.out.println("Total harga setelah diskon: " + totalHarga);
    }
}
