package Jobsheet1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalBobotNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama MK       : ");
            namaMK[i] = input.nextLine();

            System.out.print("Bobot SKS     : ");
            sks[i] = input.nextInt();

            System.out.print("Nilai Angka   : ");
            nilaiAngka[i] = input.nextDouble();
            input.nextLine();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }

            totalBobotNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.printf("%-35s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                    namaMK[i],
                    nilaiAngka[i],
                    nilaiHuruf[i],
                    nilaiSetara[i]);
        }

        System.out.println("==============================");

        double ip = totalBobotNilai / totalSKS;
        System.out.printf("IP : %.2f\n", ip);

        input.close();
    }
}
