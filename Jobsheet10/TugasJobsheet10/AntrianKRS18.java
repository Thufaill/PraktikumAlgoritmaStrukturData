package TugasJobsheet10;

public class AntrianKRS18 {
    Mahasiswaa18[] data;
    int front, rear, size, max;
    int sudahProses;

    public AntrianKRS18(int max) {
        this.max = max;
        data = new Mahasiswaa18[max];
        front = 0;
        rear = -1;
        size = 0;
        sudahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void tambah(Mahasiswaa18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswaa18 mhs = data[front];
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void tampil2Depan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }

        System.out.println("2 Antrian Terdepan:");
        for (int i = 0; i < 2; i++) {
            int idx = (front + i) % max;
            data[idx].tampilkanData();
        }
    }

    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("Antrian paling belakang:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getSudahProses() {
        return sudahProses;
    }

    public int getBelumProses() {
        return 30 - sudahProses;
    }
}
