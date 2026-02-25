package Pertemuan8;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanTotalGenap {
public static void main(String[] args) {
    int total=0;
    System.out.println("=== TOTAL BILANGAN GENAP 1-20 ===");
    for(int angka=1; angka<=20; angka++){
        if(angka%2 !=0){
            continue;
        }else{
            total = angka+total;
            System.out.println("Tambah: "+angka+" -> "+"Total: "+total);
        }
    }
    System.out.println("---");
    System.out.println("Total akhir: "+total);
}
}
