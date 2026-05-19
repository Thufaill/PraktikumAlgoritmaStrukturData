package CM2;

import java.util.Scanner;

public class MainRoyalDelish {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DLLPembeli18 antrian = new DLLPembeli18();

        DDLPesanan18 pesanan = new DDLPesanan18();

        int nomorAntrian = 1;
        int pilih;

        do {

            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    Pembeli18 pb = new Pembeli18(
                            nomorAntrian,
                            nama,
                            hp);

                    antrian.tambahAntrian(pb);

                    System.out.println(
                            "Antrian berhasil ditambahkan : "
                                    + nomorAntrian);

                    nomorAntrian++;
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    Pembeli18 dipanggil = antrian.hapusAntrian();
                    if (dipanggil == null) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println(
                                dipanggil.namaPembeli
                                        + " menuju kasir");

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan18 ps = new Pesanan18(
                                kode,
                                namaPesanan,
                                harga);

                        pesanan.tambahPesanan(ps);

                        System.out.println(
                                dipanggil.namaPembeli
                                        + " telah memesan "
                                        + namaPesanan);
                    }

                    break;
                case 4:
                    pesanan.tampilPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;
                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);

        sc.close();
    }
}
