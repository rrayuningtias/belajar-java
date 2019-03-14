public class Fungsi {
//    public static void main(String[] args) {
//        cobaFungsi();
//    }
//
//    public static void cobaFungsi() {
//        System.out.println("Ini merupakan bagian fungsi!");
//
//    }
    public static void main(String[] args) {
         double p = 7;
         double l = 6.5;
         double t = 3;
         double hasil = hitungLuas(p,l,t);
         System.out.println("Hasil adalah " + hasil);
         int pn = 7;
         int lb = 6;
         int tn = 4;
         int hsl = hitungLuas(pn,lb,tn);
         System.out.println("Hasilnya yaitu " + hsl);
    }

    public static double hitungLuas(double panjang, double lebar, double tinggi){
        double luas = panjang * lebar * tinggi;
        return luas;
    }

    public static int hitungLuas(int panjang, int lebar, int tinggi) {
        int luas = panjang * lebar * tinggi;
        return luas;
    }
}
