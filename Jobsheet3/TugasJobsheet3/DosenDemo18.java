package Jobsheet3.TugasJobsheet3;

import java.util.Scanner;

public class DosenDemo18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen18[] daftarDosen = new Dosen18[jumlah];

        for (int i = 0; i < jumlah; i++) {

            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jkInput = sc.nextLine();
            Boolean jenisKelamin = jkInput.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            System.out.println("----------------------------------");

            daftarDosen[i] = new Dosen18(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== HASIL PENGOLAHAN DATA =====");

        DataDosen18 data = new DataDosen18();

        data.dataSemuaDosen(daftarDosen);
        data.jumlahDosenPerJenisKelamin(daftarDosen);
        data.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        data.infoDosenPalingTua(daftarDosen);
        data.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}