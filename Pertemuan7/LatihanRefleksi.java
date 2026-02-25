package Pertemuan7;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanRefleksi {
public static void main(String[] args) {
    System.out.println("=== MENGGUNAKAN WHILE ===");
    int angka = 1;
    while (angka <=5) { 
        System.out.print(angka+" ");
        angka++;
    }
    System.out.println();
    int number = 1;
    System.out.println("=== MENGGUNAKAN DO-WHILE ===");
    do { 
        System.out.print(number+" ");
        number++;
    } while (number<6);
    System.out.println();
    System.out.println("=== MENGGUNAKAN FOR ===");
    for (int i=1; i<=5;i++){
        System.out.print(i+" ");
    }
}
}
