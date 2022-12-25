package UAS;
//Maulana Ishaq (21102079)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);



    System.out.println("======================================");
    System.out.println("    Penghitung Rumus fisika dasar");
    System.out.println("======================================");
    System.out.println("1. Menghitung Luas");
    System.out.println("2. Menghitung Volume");
    System.out.println("3. Menghitung percepatan");
    System.out.println("4. Menghitung Massa Jenis");
    System.out.println("5. Menghitung Gaya");
    System.out.print("Masukkan pilihan yang diinginkan :");
    int pil = input.nextByte();
    System.out.println("");
    if(pil == 1){
        penjelasan.pluas();

    }
    else if(pil ==2){
        penjelasan.pvolume();


    }
    else if(pil == 3){
        penjelasan.ppercepatan();

    }
    else if(pil == 4){
        penjelasan.pmasjen();

    }
    else if(pil == 5){
        penjelasan.pgaya();

    }
    else{
        System.out.println("Nomor yang dimasukkan salah,silahkan ketik nomor 1 sampai dengan 5");
    }
    }
}
