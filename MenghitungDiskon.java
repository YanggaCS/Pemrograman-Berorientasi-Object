package menghitung.diskon;

public class MenghitungDiskon {
    public static void main(String[] args) {

        int pembelian = 2000000;
        int diskon, potongan;

        System.out.println("Pembelian : Rp " + pembelian);
        System.out.println("Total Bayar : Rp "+ pembelian);
        diskon = (pembelian*13)/100;
        potongan = pembelian - diskon;
        if(pembelian >= 200000){
        System.out.println("Harga Bayar Diskon 13% : Rp "+ pembelian + " - Rp" + diskon + " = Rp" + potongan);
        }
    }
    
}
