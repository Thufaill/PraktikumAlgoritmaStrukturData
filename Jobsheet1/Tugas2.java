package Jobsheet1;

import java.util.Scanner;

public class Tugas2 {

    static Scanner input = new Scanner(System.in);

    static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang           : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari            : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam             : ");
            jadwal[i][3] = input.nextLine();
            System.out.println();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("Mata Kuliah\t   Ruang\t     Hari      Jam");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-15s %-8s %s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    static void tampilHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal Hari " + hari);
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                        jadwal[i][0] + " | " +
                                jadwal[i][1] + " | " +
                                jadwal[i][3]);
            }
        }
    }

    static void tampilMatkul(String[][] jadwal, int n, String matkul) {
        System.out.println("\nJadwal Mata Kuliah " + matkul);
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(
                        jadwal[i][1] + " | " +
                                jadwal[i][2] + " | " +
                                jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = input.nextLine();
        tampilHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String mk = input.nextLine();
        tampilMatkul(jadwal, n, mk);
    }
}