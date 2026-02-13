package Pertemuan3.Latihan1dan2_Pertemuan3;
/*
NAMA: KHAIRUNNISA NAILAH SAADAH
NIM: D1041241054
TANGGAL: 13/02/2026
 */
public class LatihPerhitungan {
    public static void main(String[] args) {
        //deklarasi dan inisialisasi variable
        int saldo = 1000000;
        //menapilkan saldo awal
        System.err.println("=== SIMULASI TRANSAKSI BANK ===");
        System.err.println("Saldo Awal             : "+saldo);
        //deklarasi dan inisialisasi variable
        int setoran = 500000;
        //deklarasi dan inisialisasi variable dengan menghitung jumlah saldo
        int Saldosetelahsetoran = saldo+setoran;
        //menampilkan setoran dan saldo setelah disetor
        System.out.println("Setoran                : "+setoran);
        System.out.println("Saldo Setelah Setoran  : "+Saldosetelahsetoran);
        //
        int penarikan = 250000;
        //deklarasi dan inisialisasi variable dengan menghitung jumlah saldo
        int saldoakhir = Saldosetelahsetoran-penarikan;
        //menampilkan penarikan dan saldo setelah ditarik
        System.out.println("Penarikan              : "+penarikan);
        System.out.println("Saldo Akhir            : "+saldoakhir);
    }
}
