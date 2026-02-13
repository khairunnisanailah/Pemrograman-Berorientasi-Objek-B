package Pertemuan3.Latihan1dan2_Pertemuan3;

public class LatihPerhitungan {
    public static void main(String[] args) {
        int saldo = 1000000;
        System.err.println("=== SIMULASI TRANSAKSI BANK ===");
        System.err.println("Saldo Awal             : "+saldo);
        int setoran = 500000;
        int saldosetelahsetoran = saldo+setoran;
        System.out.println("Setoran                : "+setoran);
        System.out.println("Saldo Setelah Setoran  : "+saldosetelahsetoran);
        int penarikan = 250000;
        int saldoakhir = saldosetelahsetoran-penarikan;
        System.out.println("Penarikan              : "+penarikan);
        System.out.println("Saldo Akhir            : "+saldoakhir);
    }
}
