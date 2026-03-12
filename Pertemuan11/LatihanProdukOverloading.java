package Pertemuan11;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
class Produk{
    String namaProduk;
    int harga;
    int stok;
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
        stok = 0;
    }
    public Produk(String namaProduk, int harga, int stok){
        this.namaProduk =namaProduk;
        this.harga = harga;
        this.stok = stok;
    }
    public void tampilkanInfo(){
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk : "+namaProduk);
        System.out.println("Harga       : Rp "+harga);
        System.out.println("Stok        : "+stok);
        System.out.println();
    }
}
public class LatihanProdukOverloading {
    public static void main(String[] args) {
    Produk pdk1 = new Produk("Laptop ASUS", 8500000);
    Produk pdk2 = new Produk("Mouse Logitech", 250000, 50);
    pdk1.tampilkanInfo();
    pdk2.tampilkanInfo();
    }
}
