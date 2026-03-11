package Pertemuan10;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class Mobil{
    String merk;
    String warna;
    int tahun;
    public Mobil(){
        merk = "Belum diisi";
        warna = "Belum diisi";
        tahun = 0;
    }
    public Mobil (String merk){
        this.merk = merk;
        warna = "Belum diisi";
        tahun = 0;
    }
    public Mobil (String merk, String warna, int tahun){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }
    public void tampilkanSpesifikasi(){
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : "+merk);
        System.out.println("Warna: "+warna);
        System.out.println("Tahun: "+tahun);
        System.out.println();
    }
}
public class LatihanMobilConstructor {
    public static void main(String[] args) {
        Mobil mb1 = new Mobil();
        Mobil mb2 = new Mobil("Toyota");
        Mobil mb3 = new Mobil("Honda Civic", "Merah", 2023);
        mb1.tampilkanSpesifikasi();
        mb2.tampilkanSpesifikasi();
        mb3.tampilkanSpesifikasi();
    }
}
