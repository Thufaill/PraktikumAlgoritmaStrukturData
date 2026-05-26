package Jobsheet14;

public class BinaryTreeArray18 {
    Mahasiswa18[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray18() {
        this.dataMahasiswa = new Mahasiswa18[10];
    }

    void populateData(Mahasiswa18 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Mahasiswa18 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }
        
        int currentIdx = 0;
        while (true) {
            if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                int leftChild = 2 * currentIdx + 1;
                if (leftChild >= dataMahasiswa.length) {
                    expandArray(leftChild);
                }
                if (dataMahasiswa[leftChild] == null) {
                    dataMahasiswa[leftChild] = data;
                    if (leftChild > idxLast) {
                        idxLast = leftChild;
                    }
                    break;
                }
                currentIdx = leftChild;
            } else {
                int rightChild = 2 * currentIdx + 2;
                if (rightChild >= dataMahasiswa.length) {
                    expandArray(rightChild);
                }
                if (dataMahasiswa[rightChild] == null) {
                    dataMahasiswa[rightChild] = data;
                    if (rightChild > idxLast) {
                        idxLast = rightChild;
                    }
                    break;
                }
                currentIdx = rightChild;
            }
        }
    }

    private void expandArray(int minIndex) {
        int newSize = Math.max(dataMahasiswa.length * 2, minIndex + 1);
        Mahasiswa18[] newArray = new Mahasiswa18[newSize];
        System.arraycopy(dataMahasiswa, 0, newArray, 0, dataMahasiswa.length);
        dataMahasiswa = newArray;
    }

    public void traversePreOrder() {
        traversePreOrder(0);
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && idxStart < dataMahasiswa.length) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
