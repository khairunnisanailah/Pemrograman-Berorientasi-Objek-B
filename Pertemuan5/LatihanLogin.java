package Pertemuan5;
/*
Nama: Khairunnisa Nailah Saadah
NIM: D1041241054
 */
public class LatihanLogin {
    public static void main(String[] args) {
        System.out.println("=== VALIDASI LOGIN ===");
        String password = "admin123";
        String inputUsername = "admin";
        String inputPassword = "admin";
        System.out.println("Username: admin");
        System.out.println("Password: ****");
        System.out.println("---");
        if(inputPassword.equals(password)){
            System.out.println("Username valid");
            System.out.println("Password benar");
            System.out.println("LOGIN BERHASIL!");
            System.out.println("Selamat datang, "+inputUsername);
        }else{
            System.out.println("Username valid");
            System.out.println("Password salah");
            System.out.println("LOGIN GAGAL!");
        }
    }
}
