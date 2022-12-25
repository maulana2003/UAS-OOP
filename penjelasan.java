package UAS;

public class penjelasan extends RumFis {

    public static void pluas(){
        System.out.println("Rumus luas adalah L = panjang x lebar. Panjang (p) termasuk ke dalam  besaran panjang dengan satuannya yaitu");
        System.out.println("meter dan Lebar (l) juga termasuk ke dalam besaran panjang (m).");
        System.out.println("");
        System.out.println("Hitung Luas ");
        System.out.print("Masukkan Alas :");
        panjang = input.nextByte();
        System.out.print("Masukkan Tiggi :");
        lebar = input.nextByte();
        double luas = panjang * lebar;
        System.out.println("Luas yang didapat adalah :"+ luas);
    }
    public static void pvolume(){
        System.out.println("Rumus volume adalah  V = p . l . t. Dan ketiganya sama – sama memiliki satuan yang sama yaitu meter (m).");
        System.out.println("Yang akan  menghasilkan sebuah satuan besaran volume yaitu meter kubik (m3).");
        System.out.println("");
        System.out.println("Hitung volume ");
        System.out.print("Masukkan panjang : ");
        panjang = input.nextByte();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextByte();
        System.out.print ("Masukkan Tinggi : ");
        tinggi =input.nextByte();
        volume = panjang * lebar * tinggi;
        System.out.print("Panjang yang diddapat adalah : "+ volume);
    }
    public static void ppercepatan(){
        System.out.println("Percepatan memiliki satuan SI dengan simbol (a), percepatan adalah hasil dari besaran kecepatan (m/s) dibagi waktu (s).");
        System.out.println("Sehingga rumus yang dihasilkannya adalah a = v / t.");
        System.out.println("");
        System.out.println("Hitung percepatan ");
        System.out.print("Masukkan kecepatan (v) :");
        kecepatan = input.nextByte();
        System.out.print("Masukkan waktu (t) : ");
        float waktu =input.nextByte();
        percepatan = (int) (kecepatan / waktu);
        System.out.println("Percepatan yang didapat adalah :"+percepatan );
    }
    public static void pmasjen(){
        System.out.println("Massa jenis merupakan besaran hasil turunan dari besaran massa (kg) dan dibagi besaran volume (m3).");
        System.out.println("Rumus Fisika yang dihasilkan adalah seperti ini ρ = m / v. Satuannya adalah kilogram per meter kubik (kg/m-3).");
        System.out.println("");
        System.out.println("Hitung Massa jenis(p) ");
        System.out.print("Masukkan massa :");
        massa =input.nextByte();
        System.out.print("Masukkan Volume :");
        volume = input.nextByte();
        int majen =massa / volume;
        System.out.println("Massa jenis yang didapat adalah :"+ majen);
    }
    public static void pgaya(){
        System.out.println("Gaya (F) merupakan sebuah besaran turunan dari hasil perkalian antara massa (m) dengan percepatan (a)");
        System.out.println("Sehingga  rumus yang dihasilkan adalah F = m x a.");
        System.out.println("satuan dari gaya adalah kilogram meter per sekon kuadrat (kg m/s2) dan akhirnya disebut dengan satuan N (Newton).");
        System.out.println("");
        System.out.println("Hitung Gaya ");
        System.out.print("Masukkan massa :");
        massa = input.nextByte();
        System.out.print("Masukkan percepatan :");
        percepatan = input.nextByte();
        int Gaya = massa * percepatan;
        System.out.println("Gaya yang didapat adalah :"+ Gaya);
    }


}
