package Jobsheet11.TugasJobsheet11;

public class QueueLinkedList18 {
    NodeAntrian18 front, rear;
    int size = 0;
    int max = 10;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void enqueue(MahasiswaAntrian18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        NodeAntrian18 newNode = new NodeAntrian18(mhs);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.print("Memanggil: ");
        front.data.tampil();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();

            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        NodeAntrian18 temp = front;
        System.out.println("Daftar Antrian:");
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }
}