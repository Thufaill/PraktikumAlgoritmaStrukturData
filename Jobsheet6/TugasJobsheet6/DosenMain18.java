package Jobsheet6.TugasJobsheet6;

import java.util.Scanner;

public class DosenMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 list = new DataDosen18();

        int pilih;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia Termuda)");
            System.out.println("4. Sorting DSC (Usia Tertua)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();

                    System.out.print("Nama: ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = Boolean.parseBoolean(sc.nextLine());

                    System.out.print("Usia: ");
                    int usia = Integer.parseInt(sc.nextLine());

                    list.tambah(new Dosen18(kd, nama, jk, usia));
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC (termuda → tertua)");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DSC (tertua → termuda)");
                    list.tampil();
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}
