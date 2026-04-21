package Jobsheet9;

public class Mahasiswa18 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa18(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1;
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
