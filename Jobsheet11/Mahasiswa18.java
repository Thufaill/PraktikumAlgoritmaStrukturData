package Jobsheet11;

public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa18() {
    }

    public Mahasiswa18(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("\n%-15s %-15s %-10s %-5.1f", nama, nim, kelas, ipk);
    }
}