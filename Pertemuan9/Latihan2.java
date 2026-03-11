package Pertemuan9;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class mobil1 {
    String merk;
    String warna;
    int tahun;
    int kecepatan ;
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : "+merk);
        System.out.println("Warna: "+warna);
        System.out.println("Tahun: "+tahun);
    }
    public void percepat(){
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
    }
    public void tampilkanKecepatan(){
        System.out.println("Kecepatan saat ini: "+kecepatan+"km/jam");
    }
}
public class Latihan2 {
    public static void main(String[] args) {
        mobil1 mobila = new mobil1();
        mobila.merk = "Toyota Avanza";
        mobila.warna = "Silver";
        mobila.tahun = 2020;
        mobila.tampilkanSpesifikasi();
        System.out.println();
        mobila.percepat();
        mobila.percepat();
        mobila.tampilkanKecepatan();
    }
}
