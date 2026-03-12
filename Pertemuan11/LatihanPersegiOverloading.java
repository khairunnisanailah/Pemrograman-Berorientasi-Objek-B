package Pertemuan11;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class PersegiPanjang{
    int panjang;
    int lebar;
    int luas;
    int keliling;
    public PersegiPanjang(int sisi){
        this.lebar = sisi;
        this.panjang = sisi;
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
        System.out.println("=== PERSEGI ===");
    }
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
        this.keliling = 2 *(panjang + lebar);
        System.out.println("=== PERSEGI PANJANG ===");
    }
    public void tampilkanInfo(){
        System.out.println("Panjang  : "+panjang+" cm");
        System.out.println("Lebar    : "+lebar+" cm");
        System.out.println("Luas     : "+luas+" cm²");
        System.out.println("Keliling : "+keliling+" cm");
        System.out.println();
    }
}
public class LatihanPersegiOverloading {
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang(5);
        pp1.tampilkanInfo();
        PersegiPanjang pp2 = new PersegiPanjang(8, 4);
        pp2.tampilkanInfo();
    }
}
