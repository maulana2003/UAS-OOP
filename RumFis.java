package UAS;

import java.util.Scanner;

public class RumFis {
    static Scanner input = new Scanner(System.in);
    protected static int panjang;
    protected static int lebar;
    protected static int volume;
    protected static int massa;
    protected static int percepatan;
    protected  static int tinggi;
    protected static int kecepatan;


protected static void printluas(){
    System.out.println("Luasnya adalah : " );
}
//luas
private static void Luas(){
    System.out.println("Hitung Luas ");
    System.out.print("Masukkan Alas :");
    panjang = input.nextByte();
    System.out.print("Masukkan Tiggi :");
    lebar = input.nextByte();
    double luas = panjang * lebar;
    System.out.println("Luas yang didapat adalah :"+ luas);
}
//volume
private static void volume(){
    System.out.println("Hitung volume ");
    System.out.print("Masukkan panjang : ");
    panjang = input.nextByte();
    System.out.print("Masukkan lebar : ");
    lebar = input.nextByte();
    System.out.print ("Masukkan Tinggi : ");
    int tinggi =input.nextByte();
    int volume = panjang * lebar * tinggi;
    System.out.print("Panjang yang diddapat adalah : "+ volume);
}
//percepatan
private static void percepatan(){
    System.out.println("Hitung percepatan ");
    System.out.print("Masukkan kecepatan (v) :");
    int kecepatan = input.nextByte();
    System.out.print("Masukkan waktu (t) : ");
    float waktu =input.nextByte();
    percepatan = (int) (kecepatan / waktu);
    System.out.println("Percepatan yang didapat adalah :"+percepatan );
}
//massa jenis
private static void masjen(){
    System.out.println("Hitung Massa jenis(p) ");
    System.out.print("Masukkan massa :");
    massa =input.nextByte();
    System.out.print("Masukkan Volume :");
    volume = input.nextByte();
    int majen =massa / volume;
    System.out.println("Massa jenis yang didapat adalah :"+ majen);
}
//gaya
private static void gaya(){
    System.out.println("Hitung Gaya ");
    System.out.print("Masukkan massa :");
    massa = input.nextByte();
    System.out.print("Masukkan percepatan :");
    percepatan = input.nextByte();
    int Gaya = massa * percepatan;
    System.out.println("Gaya yang didapat adalah :"+ Gaya);

}
}
