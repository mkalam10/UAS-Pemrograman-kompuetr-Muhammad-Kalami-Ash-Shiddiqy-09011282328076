import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean tersedia;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = true;
    }

    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
        System.out.println();
    }

    public void pinjamBuku() {
        if (tersedia) {
            System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
            tersedia = false;
        } else {
            System.out.println("Maaf, buku \"" + judul + "\" sedang tidak tersedia.");
        }
    }

    public boolean cekJudul(String judulCek) {
        return this.judul.equalsIgnoreCase(judulCek);
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public String getJudul() {
        return judul;
    }
}

public class Soal7 {
    public static void main(String[] args) {
        // Daftar buku
        Buku[] daftarBuku = {
            new Buku("HUJAN", "Tere Liye", 2016),
            new Buku("A Song of Ice and Fire", "George R.R. Martin", 1985),
            new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980)
        };

        // Menampilkan daftar buku yang tersedia
        System.out.println("Daftar Buku yang Tersedia:");
        for (Buku buku : daftarBuku) {
            buku.tampilkanInfoBuku();
        }

        // Meminta input judul buku yang ingin dipinjam
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
        String judulBuku = scanner.nextLine();

        boolean bukuDitemukan = false;
        for (Buku buku : daftarBuku) {
            if (buku.cekJudul(judulBuku) && buku.isTersedia()) {
                buku.pinjamBuku();
                bukuDitemukan = true;
                break;
            } else if (buku.cekJudul(judulBuku) && !buku.isTersedia()) {
                System.out.println("Maaf, buku sudah tidak tersedia.");
                bukuDitemukan = true;
                break;
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku tidak ditemukan dalam daftar atau tidak tersedia.");
        } else {
            // Menampilkan kembali daftar buku setelah buku berhasil dipinjam
            System.out.println("\nDaftar Buku Setelah Peminjaman:");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfoBuku();
            }
        }
    }
}
