package polymorphism;
//Membuat class induk tampilan
class tampilkan{
   //membuat method void suara dengan modifier public
   public void print(int angka){
     System.out.println("ini adalah angka :" + angka);
   }
   //membuat method yang sama tetapi berbeda parameter 
   public void print(String string){
     System.out.println("ini adalah string:" + string);
   }
}

public class Polymorphism{
  public static void main(String args[]){
    //membuat objek baru
    tampilkan menampilkan= new tampilkan();
    //Memanggil method print memasukkan parameter yang berbeda
    menampilkan.print("halo");
    menampilkan.print(10);
   }
} 
