package Jobsheet3;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Mahasiswa18[] arrayOfMahasiswa18 = new Mahasiswa18[3];
        arrayOfMahasiswa18[0] = new Mahasiswa18();
        arrayOfMahasiswa18[0].nim = "244107060033";
        arrayOfMahasiswa18[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa18[0].kelas = "SIB-1E";
        arrayOfMahasiswa18[0].ipk = (float) 3.75;

        arrayOfMahasiswa18[1] = new Mahasiswa18();
        arrayOfMahasiswa18[1].nim = "2341720172";
        arrayOfMahasiswa18[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa18[1].kelas = "TI-2A";
        arrayOfMahasiswa18[1].ipk = (float) 3.36;

        arrayOfMahasiswa18[2] = new Mahasiswa18();
        arrayOfMahasiswa18[2].nim = "244107023006";
        arrayOfMahasiswa18[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa18[2].kelas = "TI-2E";
        arrayOfMahasiswa18[2].ipk = (float) 3.80;

        System.out.println("NIM      : " + arrayOfMahasiswa18[0].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa18[0].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa18[0].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa18[0].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa18[1].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa18[1].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa18[1].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa18[1].ipk);
        System.out.println("----------------------------------------");
        System.out.println("NIM      : " + arrayOfMahasiswa18[2].nim);
        System.out.println("Nama     : " + arrayOfMahasiswa18[2].nama);
        System.out.println("Kelas    : " + arrayOfMahasiswa18[2].kelas);
        System.out.println("IPK      : " + arrayOfMahasiswa18[2].ipk);
        System.out.println("----------------------------------------");
    }
}
