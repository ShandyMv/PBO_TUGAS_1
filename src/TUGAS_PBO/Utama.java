package TUGAS_PBO;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        Tiket tiket = new Tiket(username, password);

        if (tiket.login(username, password)) {
            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1/2/3): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        tiket.inputDataTransaksi();
                        break;
                    case 2:
                        tiket.lihatDataTiket();
                        break;
                    case 3:
                        System.out.println("Keluar dari menu.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (choice != 3);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

    }
}
