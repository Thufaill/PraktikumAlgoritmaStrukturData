package Jobsheet6;
import java.util.ArrayList;

public class MahasiswaBerprestasi18 {
    ArrayList<Mahasiswa18> listMhs = new ArrayList<>();

    void tambah(Mahasiswa18 m) {
        listMhs.add(m);
    }

    void tampil() {
        for (Mahasiswa18 m : listMhs) {
            m.tampilInformasi();
            System.out.println("------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.size() - 1; i++) {
            for (int j = 1; j < listMhs.size() - i; j++) {
                if (listMhs.get(j).ipk > listMhs.get(j - 1).ipk) {
                    Mahasiswa18 tmp = listMhs.get(j);
                    listMhs.set(j, listMhs.get(j - 1));
                    listMhs.set(j - 1, tmp);
                }
            }
        }
    }
}