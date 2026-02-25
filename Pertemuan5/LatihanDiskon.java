package Pertemuan5;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanDiskon {
    public static void main(String[] args) {
        double totalBelanja = 750000;
        int diskon;
        System.out.println("=== KALKULATOR DISKON === ");
        if (totalBelanja>=1000000){
            diskon = 15;
        }else if (totalBelanja>= 500000 && totalBelanja <= 999999){
            diskon = 10;
        } else if (totalBelanja>=100000 && totalBelanja<=499999){
            diskon =5;
        }else {
            diskon =0;
        }
        System.out.println("Total Belanja: Rp "+totalBelanja);
        System.out.println("Diskon("+diskon+"%): Rp "+(totalBelanja*diskon/100));
        System.out.println("Harga Akhir: Rp "+(totalBelanja-((totalBelanja*diskon/100))));
        System.out.println("Anda Hemat: Rp "+(totalBelanja*diskon/100));
    }
}
