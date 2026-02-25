package Pertemuan6;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanHariBulan {
    public static void main(String[] args) {
        int month = 4;
        String namaBulan;
        System.out.println("=== JUMLAH HARI DALAM BULAN===");
        switch (month) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Febuari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                namaBulan = "Eror: Angka bulan tidak valid (1-12)";
                break;
        }
        System.out.println("Bulan: "+namaBulan+" (bulan ke-"+month+")");
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Jumlah hari: 31 hari");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Jumlah hari: 30 hari");
                break;
            case 2:
                System.out.println("Jumlah hari: 28 hari");
                break;
            default:
                System.out.println("Angka bulan tidak valid (1-12)");
                break;
        }
    }
}
