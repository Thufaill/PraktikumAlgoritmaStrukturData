package Jobsheet7;

public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa18() {
    }

    Mahasiswa18(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.ipk = ip;
        this.kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
