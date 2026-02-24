package Jobsheet2.TugasJobsheet2;

public class MataKuliahMain18 {

    public static void main(String[] args) {

        // Objek 1 → menggunakan konstruktor default
        MataKuliah18 mk1 = new MataKuliah18();
        
        // Objek 2 → menggunakan konstruktor berparameter
        MataKuliah18 mk2 = new MataKuliah18(
                "DASPRO_TI",
                "Dasar Pemograman",
                3,
                6
        );

        System.out.println("=== DATA MATA KULIAH 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(4);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        System.out.println("=== DATA MATA KULIAH 2 ===");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(2);
        mk2.kurangiJam(10); // gagal
        mk2.kurangiJam(3);  // berhasil
        mk2.tampilInformasi();
    }
}