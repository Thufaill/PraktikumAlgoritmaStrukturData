package Quiz2;

public class DLLPembeli {

    NodePembeli head;
    NodePembeli tail;

    public void tambahAntrian(Pembeli data) {

        NodePembeli newNode = new NodePembeli(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void cetakAntrian() {

        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli current = head;

        System.out.println("=================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=================================");

        while (current != null) {

            System.out.println(
                    current.data.noAntrian + " "
                            + current.data.namaPembeli + " "
                            + current.data.noHp);

            current = current.next;
        }
    }

    public Pembeli hapusAntrian() {

        if (head == null) {
            return null;
        }

        Pembeli data = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }

    public void tambahPrioritas(Pembeli data) {

        NodePembeli newNode = new NodePembeli(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        int posisi = 3;

        NodePembeli current = head;
        int index = 1;

        while (current != null && index < posisi - 1) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }
}