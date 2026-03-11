package Pertemuan10;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class Persegi{
    int sisi;
    int luas;
    int keliling;
    public Persegi(int sisi){
        if (sisi <= 0){
            System.out.println("EROR: Sisi tidak boleh <=0. Diset ke default (1).");
            this.sisi =1;
        }else{
            this.sisi = sisi;
        }
        this.luas = this.sisi*this.sisi;
        this.keliling = 4*this.sisi;
    }
    public void tampilkanHasil(){
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : "+sisi+" cm");
        System.out.println("Luas     : "+luas+" cm²");
        System.out.println("Keliling : "+keliling+" cm");
        System.out.println();
    }

}
public class LatihanPersegiConstructor {
    public static void main(String[] args) {
        Persegi psg1 = new Persegi(5);
        psg1.tampilkanHasil();
        Persegi psg2 = new Persegi(-3);
        psg2.tampilkanHasil();
    }
}
