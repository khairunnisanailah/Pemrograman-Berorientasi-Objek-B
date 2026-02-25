package Pertemuan5;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanBilangan {
    public static void main(String[] args) {
        int number = -7;
        System.out.println("=== PEMERIKSAAN BILANGAN ===");
        System.out.println("Bilangan: "+number);
        String tipe;
        if (number>0){
            System.out.println("Jenis: Bilangan positif");
            System.out.println("Tipe: "+((number%2==0) ? "Genap":"Ganjil"));
        }else if (number <0){
            System.out.println("Jenis: Bilangan negatif");
            System.out.println("Tipe: "+((number%2==0) ? "Genap":"Ganjil"));
        }else {
            System.out.println("Jenis: Bilangan nol");
        }
    }
}
