package Pertemuan8;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanMenuHarian {
public static void main(String[] args) {
    System.out.println("=== MENU MAKAN 3 HARI ===");
    for(int hari=1; hari<=3;hari++){
        System.out.println("Hari "+hari+":");
        for (int waktu=1; waktu<=2; waktu++){
            if (waktu==1){
                System.out.print("  Pagi: ");
                if (hari==1){
                    System.out.println("Nasi Goreng");
                } else if (hari==2){
                    System.out.println("Bubur Ayam");
                }else {
                    System.out.println("Roti Bakar");
                }
            }else{
                if(waktu==2){
                    System.out.print("  Siang: ");
                    if (hari==1){
                        System.out.println("Soto Ayam");
                    } else if (hari==2){
                        System.out.println("Mie Goreng");
                    }else {
                         System.out.println("Nasi Uduk");
                }
                }
            }
        
        }
        System.out.println();
    }
}
}
