package TUGAS_PBO;

import java.util.Scanner;
class Tiket {
    private String username;
    private String password;
    private double hargaTiketPesawat;
    private int jumlahPenumpang;
    private double hargaKamarHotel;
    private int jumlahKamar;

    public Tiket(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public void inputDataTransaksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan harga tiket pesawat: ");
        hargaTiketPesawat = scanner.nextDouble();
        System.out.print("Masukkan jumlah penumpang: ");
        jumlahPenumpang = scanner.nextInt();
        System.out.print("Masukkan harga kamar hotel: ");
        hargaKamarHotel = scanner.nextDouble();
        System.out.print("Masukkan jumlah kamar: ");
        jumlahKamar = scanner.nextInt();
    }

    public void lihatDataTiket() {
        double hargaTiket = hargaTiketPesawat * jumlahPenumpang;
        double asuransi = jumlahPenumpang * 29000;
        double totalHargaTiket = hargaTiket + asuransi;

        double diskon = 0.45 * hargaKamarHotel;
        double totalBiayaHotel = (hargaKamarHotel - diskon) * jumlahKamar;

        System.out.println("Total Harga Tiket Pesawat: " + totalHargaTiket);
        System.out.println("Total Biaya Kamar Hotel: " + totalBiayaHotel);
    }
}

