package Quiz1;

import java.util.Scanner;

import Quiz1.Cafe18.Menu;

public class CafeMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();

        Menu[] daftarMenu = new Menu[jumlahMenu];

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMenu ke-" + (i + 1));

            System.out.print("Nama Menu : ");
            String namaMenu = sc.next();

            System.out.print("Harga     : ");
            double harga = sc.nextDouble();

            System.out.print("Stok      : ");
            int stok = sc.nextInt();
            sc.nextLine();

            daftarMenu[i] = new Cafe18().new Menu(namaMenu, harga, stok);
        }

        System.out.println("\n===== DAFTAR MENU =====");
        for (int i = 0; i < jumlahMenu; i++) {
            daftarMenu[i].tampilInfo();
        }

        sc.close();
    }
}
