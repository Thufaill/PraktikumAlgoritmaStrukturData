package TugasJobsheet10;

import java.util.Scanner;

public class MainKRS18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS18 antrian = new AntrianKRS18(10);

        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses KRS (2 orang)");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Sisa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswaa18 m = new Mahasiswaa18(nim, nama, prodi, kelas);
                    antrian.tambah(m);
                    break;

                case 2:
                    antrian.prosesKRS();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;

                case 4:
                    antrian.tampil2Depan();
                    break;

                case 5:
                    antrian.tampilBelakang();
                    break;

                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Sudah proses: " + antrian.getSudahProses());
                    break;

                case 8:
                    System.out.println("Belum KRS: " + antrian.getBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 0);

        sc.close();
    }
}
