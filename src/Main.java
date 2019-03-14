

public class Main {
    public static void main(String[] args) {
//        Hewan Elang = new Hewan("Elang");
//        Hewan Kucing = new Hewan(2);

//        Elang.beratHewan(9);
//        Elang.jumlahKaki(2);
//        Elang.cetakHewan();

//        Kucing.beratHewan(5);
//        Kucing.jumlahKaki(4);
//        Kucing.cetakHewan();

        Hewan kucing = new Hewan(2);
//        kucing.makan();
//        kucing.jalan();
//        kucing.lari();

        System.out.println("\n");
        System.out.println("Umurnya adalah " + kucing.getUmur());

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);

    }
}
