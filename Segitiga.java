package inheritance;

public class Segitiga extends BangunDatar{
    
    float alas, tinggi;
    
    @Override
    float luas(){
        float luas = 1/2 *(alas * tinggi);
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float keliling = 3 * alas;
        System.out.println("Keliling Segitiga : " + keliling);
        return keliling;
    }
    
}
