package Pertemuan10;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class Buku {
    String judul;
    String pengarang;
    int harga;
    public Buku(){
        judul = "Belum diisi";
        pengarang = "Belum diisi";
        harga = 0;
    }
    public Buku(String judul, String pengarang, int harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void tampilkanInfo(){
     System.out.println("=== INFORMASI BUKU ===");
     System.out.println("Judul     : "+judul);
     System.out.println("Pengarang : "+pengarang);
     System.out.println("Harga     : Rp "+harga);
     System.out.println();
    }
    }
public class LatihanBukuConstructor {
public static void main(String[] args) {
    Buku bk1 = new Buku();
    Buku bk2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
    Buku bk3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir",150000);
    bk1.tampilkanInfo();
    bk2.tampilkanInfo();
    bk3.tampilkanInfo();
}
}
