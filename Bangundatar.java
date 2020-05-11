package bangundatar;

class bangunDatar1 {    
    float luas(){
        System.out.println("Menghitung laus bangun datar");
        return 0;
    }    
    float keliling(){
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}

class Persegi extends bangunDatar1{
    float sisi;   
}

class Lingkaran extends bangunDatar1{
    float r;
}

class PersegiPanjang extends bangunDatar1 {
    float panjang;
    float lebar;
}

class Segitiga extends bangunDatar1 {
    float alas;
    float tinggi;
    
}

public class Bangundatar {
    public static void main(String[] args) {
        
        bangunDatar1 bangunDatar2 = new bangunDatar1();
        
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        bangunDatar2.luas();
        bangunDatar2.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
    
}
