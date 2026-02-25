package Pertemuan7;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanValidasi {
public static void main(String[] args) {
    System.out.println("=== VALIDASI NILAI UJIAN ===");
    System.out.println();
    int nilai=-10;
    int percobaan =1;
    do { 
        System.out.println("Percobaan input: "+nilai);
        if (nilai >= 0 && nilai <=100 ){
            System.out.println("Nilai valid: "+nilai);
            System.out.println();
        }else {
            System.out.println("Error: Nilai harus antara 0-100!");
            System.out.println();
        }
        if (percobaan==1){
            nilai = 150;
        }else if (percobaan == 2){
            nilai = 85;
        }
        percobaan++;
    } while (percobaan<=3);
}
}
