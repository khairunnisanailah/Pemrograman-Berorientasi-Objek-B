package Pertemuan3.Latihan1dan2_Pertemuan3;
/*
NAMA: KHAIRUNNISA NAILAH SAADAH
NIM: D1041241054
TANGGAL: 13/02/2026
 */
public class LatihDataMahasiswa {
    public static void main(String[] args) {
        //deklarasi dan inisialisasi variable
        long nim = 2301010001L;// menggunakan long karena melebihi int
        String nama = "Budi Santoso"; //menggunakan string karena ingin menyimpan lebih dari 1 karakter
        char kelas = 'A'; //menggunakan char karena hanya ingin menyimpan 1 karakter
        boolean status = true;
        double ipk = 3.75; // menggunakan double karena ipk memiliki nilai desimal
        int sks = 72;
         //menampilkan data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NIM           : "+nim);
        System.out.println("Nama          : "+nama);
        System.out.println("Kelas         : "+kelas);
        System.out.println("Status Aktif  : "+status);
        System.out.println("IPK Semester  : "+ipk);
        System.out.println("Total SKS     : "+sks);
    }
}