package Pertemuan6;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanRestoran {
    public static void main(String[] args) {
        System.out.println("=== MENU RESTORAN ===");
        int menuCode =1;
        int quantity = 2;
        String menuPesanan;
        int hargaSatuan;
        System.out.println("Kode Menu: "+menuCode);
        System.out.println("Jumlah: "+quantity);
        switch (menuCode) {
            case 1:
                menuPesanan = "Nasi Goreng";
                hargaSatuan = 15000;
                break;
            case 2:
                menuPesanan =" Mie Ayam";
                hargaSatuan = 12000;
                break;
            case 3:
                menuPesanan = "Bakso";
                hargaSatuan = 10000;
                break;
            case 4:
                menuPesanan = "Soto Ayam";
                hargaSatuan = 13000;
                break;
            case 5:
                menuPesanan = "Es Teh";
                hargaSatuan=3000;
                break;
            default:
                menuPesanan = "Kode menu eror";
                hargaSatuan = 0;
                break;
        }
        System.out.println();
        System.out.println("Pesanan Anda: ");
        System.out.println("Nama Menu: "+menuPesanan);
        System.out.println("Harga Satuan: Rp "+hargaSatuan);
        System.out.println("Jumlah: "+quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp "+(hargaSatuan*quantity));
    }
}
