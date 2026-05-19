package CM2;

public class DDLPesanan18 {

    NodePesanan18 head;
    NodePesanan18 tail;

    public void tambahPesanan(Pesanan18 data) {

        NodePesanan18 newNode = new NodePesanan18(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        if (data.namaPesanan.compareToIgnoreCase(
                head.data.namaPesanan) < 0) {

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

            return;
        }

        NodePesanan18 current = head;

        while (current.next != null &&
                data.namaPesanan.compareToIgnoreCase(
                        current.next.data.namaPesanan) > 0) {

            current = current.next;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

    public void tampilPesanan() {

        if (head == null) {
            System.out.println("Belum ada pesanan");
            return;
        }

        NodePesanan18 current = head;
        int total = 0;

        System.out.println("============================");
        System.out.println("LAPORAN PESANAN");
        System.out.println("============================");

        while (current != null) {

            System.out.println(
                    current.data.kodePesanan + " "
                    + current.data.namaPesanan + " "
                    + current.data.harga);

            total += current.data.harga;

            current = current.next;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}
