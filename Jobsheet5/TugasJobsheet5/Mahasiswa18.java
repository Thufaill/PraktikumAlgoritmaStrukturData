package Jobsheet5.TugasJobsheet5;

public class Mahasiswa18 {

    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa18(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Divide and Conquer mencari UTS tertinggi
    static int maxUTS(Mahasiswa18 arr[], int l, int r){
        if(l == r){
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int kiri = maxUTS(arr, l, mid);
        int kanan = maxUTS(arr, mid + 1, r);

        return Math.max(kiri, kanan);
    }

    // Divide and Conquer mencari UTS terendah
    static int minUTS(Mahasiswa18 arr[], int l, int r){
        if(l == r){
            return arr[l].nilaiUTS;
        }

        int mid = (l + r) / 2;

        int kiri = minUTS(arr, l, mid);
        int kanan = minUTS(arr, mid + 1, r);

        return Math.min(kiri, kanan);
    }

    // Brute Force menghitung rata-rata UAS
    static double rataUAS(Mahasiswa18 arr[]){
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total += arr[i].nilaiUAS;
        }

        return (double) total / arr.length;
    }
}