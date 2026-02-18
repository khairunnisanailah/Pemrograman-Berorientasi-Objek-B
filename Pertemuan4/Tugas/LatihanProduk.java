package Pertemuan4.Tugas;

public class LatihanProduk {
    public static final double PAJAK = 0.11;
public static void main(String[] args) {
    String namaProduk = "Laptop Asus";
    int hargaSatuan = 7000000;
    int jumlahStok = 15;
    boolean isStatusTersedia = true;
    int totalNilaiStok = hargaSatuan*jumlahStok;
    int pajak = (int)(totalNilaiStok*PAJAK);
    System.out.println("=== INFORMASI PRODUK ===");
    System.out.println("Nama Produk: "+namaProduk);
    System.out.println("Harga Satuan: Rp "+hargaSatuan);
    System.out.println("Jumlah Stok: "+jumlahStok);
    System.out.println("Status Tersedia: "+isStatusTersedia);
    System.out.println("---");
    System.out.println("Total Nilai Stok: Rp "+totalNilaiStok);
    System.out.println("Pajak (11%): Rp "+pajak);
}
}
