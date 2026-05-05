package Jobsheet11;

public class SLLMain18 {
    public static void main(String[] args) {

        SingleLinkedList18 sll = new SingleLinkedList18();

        Mahasiswa18 mhs1 = new Mahasiswa18("001", "Alvaro", "1A", 4.0);
        Mahasiswa18 mhs2 = new Mahasiswa18("002", "Bimon", "2B", 3.8);
        Mahasiswa18 mhs3 = new Mahasiswa18("003", "Cintia", "3C", 3.5);
        Mahasiswa18 mhs4 = new Mahasiswa18("004", "Dirga", "4D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Dirga", mhs3);

        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("Data index 1:");
        sll.getData(1);

        System.out.println("\nData mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}