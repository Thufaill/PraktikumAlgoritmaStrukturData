package Jobsheet3.TugasJobsheet3;

public class DataDosen18 {

    // a. Menampilkan semua dosen
    public void dataSemuaDosen(Dosen18[] arrayOfDosen) {
        int no = 1;
        for (Dosen18 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            d.tampilData();
        }
    }

    // b. Jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen18 d : arrayOfDosen) {
            if (d.jenisKelamin)
                pria++;
            else
                wanita++;
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("----------------------------------");
    }

    // c. Rata-rata usia per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen18[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen18 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }

        double rataPria = (jmlPria > 0) ? (double) totalPria / jmlPria : 0;
        double rataWanita = (jmlWanita > 0) ? (double) totalWanita / jmlWanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
        System.out.println("----------------------------------");
    }

    // d. Info dosen paling tua
    public void infoDosenPalingTua(Dosen18[] arrayOfDosen) {
        Dosen18 tertua = arrayOfDosen[0];

        for (Dosen18 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilData();
    }

    // e. Info dosen paling muda
    public void infoDosenPalingMuda(Dosen18[] arrayOfDosen) {
        Dosen18 termuda = arrayOfDosen[0];

        for (Dosen18 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilData();
    }
}
