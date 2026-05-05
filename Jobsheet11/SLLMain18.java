package Jobsheet11;

public class SLLMain18 {
    public static void main(String[] args) {

        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 mhs1 = new Mahasiswa18("001", "Andi", "TI-1A", 3.5);
        Mahasiswa18 mhs2 = new Mahasiswa18("002", "Budi", "TI-1B", 3.7);
        Mahasiswa18 mhs3 = new Mahasiswa18("003", "Dirga", "TI-1C", 3.8);
        Mahasiswa18 mhs4 = new Mahasiswa18("004", "Citra", "TI-1D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);
        sll.print();

        sll.insertAt(2, mhs2);
        sll.print();
    }
}
