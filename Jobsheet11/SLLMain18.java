package Jobsheet11;

import java.util.Scanner;

public class SLLMain18 {
    public static void main(String[] args) {

        SingleLinkedList18 sll = new SingleLinkedList18();

        Scanner sc = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("Masukkan data mahasiswa:");
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa18 mhs = new Mahasiswa18(nama, nim, kelas, ipk);

            System.out.println("\nPilih operasi penambahan:");
            System.out.println("1. Tambah di awal (addFirst)");
            System.out.println("2. Tambah di akhir (addLast)");
            System.out.println("3. Tambah di indeks tertentu (insertAt)");
            System.out.println("4. Tambah setelah nama tertentu (insertAfter)");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    sll.addFirst(mhs);
                    break;
                case 2:
                    sll.addLast(mhs);
                    break;
                case 3:
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    sll.insertAt(index, mhs);
                    break;
                case 4:
                    System.out.print("Masukkan nama yang mendahului: ");
                    String key = sc.nextLine();
                    sll.insertAfter(key, mhs);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            sll.print();

            System.out.print("\nApakah Anda ingin menambah data lagi? (y/n): ");
            String jawab = sc.nextLine();
            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
            }
        }

        System.out.println("Program selesai.");

        sc.close();
    }
}