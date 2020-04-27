class tampilkan{
  
   public void print(int angka){
     System.out.println("ini adalah angka :" + angka);
   }
   
   public void print(String string){
     System.out.println("ini adalah string:" + string);
   }
    
}

public class main{
  public static void main(String args[]){
    tampilkan menampilkan= new tampilkan();
    
    menampilkan.print("halo");
    menampilkan.print(10);
    
     
   }
}