package Jobsheet9.TugasJobsheet9;

import java.util.Scanner;

public class SuratDemo18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat18 stack = new StackSurat18(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat18 s = new Surat18(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat18 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan");
                    } else {
                        System.out.println("Surat tidak ditemukan");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih >= 1 && pilih <= 4);

        scan.close();
    }
}
