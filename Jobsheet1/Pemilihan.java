package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();
        input.close();

        System.out.println("==============================");
        System.out.println("==============================");

        boolean valid = true;

        if (tugas < 0 || tugas > 100) {
            valid = false;
        }
        if (kuis < 0 || kuis > 100) {
            valid = false;
        }
        if (uts < 0 || uts > 100) {
            valid = false;
        }
        if (uas < 0 || uas > 100) {
            valid = false;
        }

        if (!valid) {
            System.out.println("nilai tidak valid");
            return;
        }

        double nilaiAkhir = (0.20 * tugas) + (0.20 * kuis) +
                (0.30 * uts) + (0.40 * uas);

        String nilaiHuruf;
        String status;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            status = "LULUS";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            status = "LULUS";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            status = "LULUS";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            status = "LULUS";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            status = "LULUS";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            status = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            status = "TIDAK LULUS";
        }

        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");
        System.out.println("==============================");

        if (status.equals("LULUS")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}