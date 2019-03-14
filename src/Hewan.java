public class Hewan {
//    String nama;
//    int berat;
//    int jumlahKaki;
//
//    public Hewan(String namaHewan){
//        nama = namaHewan;
//    }
//
//    public void beratHewan(int beratHewan){
//        berat = beratHewan;
//    }
//
//    public void jumlahKaki(int jumlahKakiHewan){
//        jumlahKaki = jumlahKakiHewan;
//    }
//
//    public void cetakHewan(){
//        System.out.println("Nama Hewan = " +nama);
//        System.out.println("Beratnya = " +berat+" Kg");
//        System.out.println("Jumlah Kaki = " +jumlahKaki);
//        System.out.println("\n");
//    }

    double tinggi = 30;
    double berat = 3;
    int umur;

    Hewan(int umur){
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan cepat..");
    }

    void jalan(){
        System.out.println("Berjalan pelan..");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat(){
        return berat;
    }

    double getTinggi(){
        return tinggi;
    }

    int getUmur(){
        return umur;
    }
}
