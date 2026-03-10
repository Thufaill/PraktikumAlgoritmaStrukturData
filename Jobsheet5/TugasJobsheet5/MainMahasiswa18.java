package Jobsheet5.TugasJobsheet5;

public class MainMahasiswa18 {
    public static void main(String[] args) {

        Mahasiswa18 data[] = {
            new Mahasiswa18("Ahmad","220101001",2022,78,82),
            new Mahasiswa18("Budi","220101002",2022,85,88),
            new Mahasiswa18("Cindy","220101003",2021,90,87),
            new Mahasiswa18("Dian","220101004",2021,76,79),
            new Mahasiswa18("Eko","220101005",2023,92,95),
            new Mahasiswa18("Fajar","220101006",2020,88,85),
            new Mahasiswa18("Gina","220101007",2023,80,83),
            new Mahasiswa18("Hadi","220101008",2020,82,84)
        };

        int maxUTS = Mahasiswa18.maxUTS(data, 0, data.length-1);
        int minUTS = Mahasiswa18.minUTS(data, 0, data.length-1);
        double rataUAS = Mahasiswa18.rataUAS(data);

        System.out.println("Nilai UTS Tertinggi : " + maxUTS);
        System.out.println("Nilai UTS Terendah  : " + minUTS);
        System.out.println("Rata-rata Nilai UAS : " + rataUAS);
    }
}
