import java.util.Scanner;

class AkunPengguna {
    private String username;
    private String password;
    private boolean aktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = false;
    }

    public void tampilkanInfoAkun() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    public void aktifkanAkun() {
        if (!aktif) {
            System.out.println("Akun berhasil diaktifkan.");
            aktif = true;
        } else {
            System.out.println("Akun sudah aktif.");
        }
    }

    public void nonaktifkanAkun() {
        if (aktif) {
            System.out.println("Akun berhasil dinonaktifkan.");
            aktif = false;
        } else {
            System.out.println("Akun sudah nonaktif.");
        }
    }
}

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        AkunPengguna akun1 = new AkunPengguna(usernameInput, passwordInput);

        System.out.println("Informasi akun sebelum diaktifkan:");
        akun1.tampilkanInfoAkun();

        System.out.println("Aktifkan akun? (y/n): ");
        String pilihanAktifkan = scanner.nextLine();
        if (pilihanAktifkan.equalsIgnoreCase("y")) {
            akun1.aktifkanAkun();
        }

        System.out.println("Informasi akun setelah diaktifkan:");
        akun1.tampilkanInfoAkun();

        System.out.println("Nonaktifkan akun? (y/n): ");
        String pilihanNonaktifkan = scanner.nextLine();
        if (pilihanNonaktifkan.equalsIgnoreCase("y")) {
            akun1.nonaktifkanAkun();
        }

        System.out.println("Informasi akun setelah dinonaktifkan:");
        akun1.tampilkanInfoAkun();
    }
}
