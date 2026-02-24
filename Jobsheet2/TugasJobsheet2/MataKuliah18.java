package Jobsheet2.TugasJobsheet2;

public class MataKuliah18 {

    // Atribut
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    // Konstruktor Default
    public MataKuliah18() {
        kodeMK = "AG_TI";
        nama = "Agama";
        sks = 2;
        jumlahJam = 2;
    }

    // Konstruktor Berparameter
    public MataKuliah18(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    // Method tampilInformasi
    public void tampilInformasi() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("---------------------------");
    }

    // Method ubahSKS
    public void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    // Method tambahJam
    public void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan.");
        System.out.println("Jumlah jam sekarang: " + jumlahJam);
    }

    // Method kurangiJam
    public void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi.");
            System.out.println("Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi.");
        }
    }
}
