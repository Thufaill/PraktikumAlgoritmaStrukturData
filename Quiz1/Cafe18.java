package Quiz1;

public class Cafe18 {

    public class Menu {
        String namaMenu;
        double harga;
        int stok;

        public Menu(String namaMenu, double harga, int stok) {
            this.namaMenu = namaMenu;
            this.harga = harga;
            this.stok = stok;
        }

        public void tampilInfo() {
            System.out.println("Nama Menu : " + namaMenu);
            System.out.println("Harga     : Rp " + harga);
            System.out.println("Stok      : " + stok);
            System.out.println("----------------------");
        }

        public void tambahStok(int jumlah) {
            stok += jumlah;
        }

        public void kurangiStok(int jumlah) {
            if (jumlah <= stok) {
                stok -= jumlah;
            } else {
                System.out.println("Stok tidak mencukupi!");
            }
        }
    }
}