import java.util.Scanner;
public class Tipe_Data{
  public static void main(String [] args){
    int masukan1,masukan2,hasil;
    Scanner in=new Scanner (System.in);
    System.out.print("Masukan Angka pertama = ");
    masukan1=in.nextInt();
    System.out.print("Masukaan Angka kedua  = ");
    masukan2=in.nextInt();
    hasil=masukan1+masukan2;    
    System.out.print(masukan1+"+"+masukan2+"="+hasil);
  }
}  