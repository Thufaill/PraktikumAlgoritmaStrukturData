package Jobsheet3.TugasJobsheet3;

public class Dosen18 {

    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    public Dosen18(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilData(int nomor) {
        String jk = (jenisKelamin) ? "Pria" : "Wanita";

        System.out.println("Data Dosen ke-" + nomor);
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
        System.out.println("----------------------------------");
    }
}