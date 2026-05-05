package Jobsheet11.TugasJobsheet11;

import java.util.Scanner;

public class MainQueue18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList18 q = new QueueLinkedList18();

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Lihat Depan & Belakang");
            System.out.println("7. Tampilkan Semua");
            System.out.println("8. Jumlah Antrian");
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
                    System.out.print("Keperluan: ");
                    String kep = sc.nextLine();

                    q.enqueue(new MahasiswaAntrian18(nim, nama, kep));
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    System.out.println(q.isEmpty() ? "Kosong" : "Tidak kosong");
                    break;

                case 4:
                    System.out.println(q.isFull() ? "Penuh" : "Tidak penuh");
                    break;

                case 5:
                    q.clear();
                    break;

                case 6:
                    q.peek();
                    break;

                case 7:
                    q.print();
                    break;

                case 8:
                    q.jumlah();
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}
