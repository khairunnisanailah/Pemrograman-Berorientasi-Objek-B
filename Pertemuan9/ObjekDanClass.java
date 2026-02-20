package Pertemuan9;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
Tanggal: 20/02/2026
 */
class mobil{
    String merk;
    String warna;
    int tahun;
    int kecepatan;
    public void percepat(int increment){
        kecepatan += increment;
    }
    public void tampilkanInfo (){
        System.out.println("Merk: "+merk);
        System.out.println("Warna: "+warna);
        System.out.println("Tahun: "+tahun);
        System.out.println("Kecepatan: "+kecepatan+" KM/jam");
}
}
public class ObjekDanClass {
    public static void main(String[] args) {
        mobil obj1 = new mobil();
        obj1.merk = "Jeep";
        obj1.warna = "Hitam";
        obj1.tahun = 2025;
        obj1.kecepatan =1500;
        System.out.println("=== INFORMASI MOBIL ===");
        obj1.tampilkanInfo();

        obj1.percepat(100);
        System.out.println("\nSetelah dipercepat");
        obj1.tampilkanInfo();
    }
}

