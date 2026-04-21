package CM1;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa18[] mhs = {
                new Mahasiswa18("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa18("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa18("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku18[] buku = {
                new Buku18("B001", "Algoritma", 2020),
                new Buku18("B002", "Basis Data", 2019),
                new Buku18("B003", "Pemrograman", 2021),
                new Buku18("B004", "Fisika", 2024)
        };

        Peminjaman18[] pinjam = {
                new Peminjaman18(mhs[0], buku[0], 7),
                new Peminjaman18(mhs[1], buku[1], 3),
                new Peminjaman18(mhs[2], buku[2], 10),
                new Peminjaman18(mhs[2], buku[3], 6),
                new Peminjaman18(mhs[0], buku[1], 4)
        };

        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan Kode Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for (Mahasiswa18 m : mhs) m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for (Buku18 b : buku) b.tampilBuku();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (Peminjaman18 p : pinjam) p.tampilPeminjaman();
                    break;

                case 4:
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman18 temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman18 p : pinjam) p.tampilPeminjaman();
                    break;

                case 5:
                    System.out.print("Masukkan Kode Buku: ");
                    String cari = sc.next();

                    boolean ketemu = false;

                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].buku.kodeBuku.equals(cari)) {
                            pinjam[i].tampilPeminjaman();
                            ketemu = true;
                        }
                    }


                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;
            }

        } while (pilih != 0);
    
    sc.close();
    }
}