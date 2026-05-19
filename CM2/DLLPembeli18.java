package CM2;

public class DLLPembeli18 {

    NodePembeli18 head;
    NodePembeli18 tail;

    public void tambahAntrian(Pembeli18 data) {

        NodePembeli18 newNode = new NodePembeli18(data);

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

        NodePembeli18 current = head;

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

    public Pembeli18 hapusAntrian() {

        if (head == null) {
            return null;
        }

        Pembeli18 data = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }
}