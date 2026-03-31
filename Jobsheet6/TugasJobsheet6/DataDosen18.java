package Jobsheet6.TugasJobsheet6;

public class DataDosen18 {
    Dosen18[] dataDosen = new Dosen18[10];
    int idx;

    void tambah(Dosen18 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen masih kosong");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println("------------------------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen18 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen18 tmp = dataDosen[i];
            dataDosen[i] = dataDosen[max];
            dataDosen[max] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen18 temp = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
}
