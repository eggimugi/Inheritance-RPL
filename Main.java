package inheritance;

public class Main {

    public static void main(String[] args) {
        
        // Memanggil class BangunDatar
        BangunDatar bangunDatar = new BangunDatar();
        
        // Memanggil class Persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        // Memanggil class Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 3;
        
        // Memanggil class PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 4;
        persegiPanjang.lebar = 5;
        
        // Memanggil class Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 7;
        
        // Memanggil method dan luas keliling
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
        
    }
    
}
