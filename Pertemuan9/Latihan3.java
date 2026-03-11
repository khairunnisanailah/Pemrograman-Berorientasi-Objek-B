package Pertemuan9;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class Persegi {
    int sisi;
    int keliling;
    int luas;
    public void hitungLuas(){
        luas = sisi * sisi;
    }
    public void hitungKeliling(){
        keliling = 4 * sisi;
    }
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : "+sisi+" cm");
        System.out.println("Luas     : "+luas+" cm²");
        System.out.println("Keliling : "+keliling+" cm");
    }
}
public class Latihan3 {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.sisi =5;
        p.hitungLuas();
        p.hitungKeliling();
        p.tampilkanHasil();
    }
}
