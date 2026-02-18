package Pertemuan4.Tugas;

public class LatihanKalkulator {
  public static void main(String[] args) {
      System.out.println("=== KALKULATOR ===");
      int angka1 = 25;
      int angka2 = 4;
      System.out.println("Angka 1: "+angka1);
      System.out.println("Angka 2: "+angka2);
      System.out.println("---");
      int penjumlahan = angka1+angka2;
      int pengurangan = angka1-angka2;
      int perkalian = angka1*angka2;
      double pembagianDesimal = (double) angka1/angka2;
      int pembagianIntiger = (int) angka1/angka2;
      int sisaBagi = angka1%angka2;
      System.out.println("Penjumlahan: "+penjumlahan);
      System.out.println("Pengurangan: "+pengurangan);
      System.out.println("Perkalian: "+perkalian);
      System.out.println("Pembagian: "+pembagianIntiger);
      System.out.println("Sisa Bagi: "+sisaBagi);
      System.out.println("Pembagian Desimal: "+pembagianDesimal);
  }  
}
