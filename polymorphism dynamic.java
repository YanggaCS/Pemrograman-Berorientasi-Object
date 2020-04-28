package polymorphism;
// Membuat class induk dengan nama hewan
class Hewan {
    //Membuat method void suara dengan modifier public
    public void suara() {
        System.out.println("....");
    }
}
//Membuat class kucing yeng merupakan turunan dari class hewan
class Kucing extends Hewan {
    //Membuat method overiding
    @Override
    public void suara() {
        System.out.println("Meong");
    }
}
class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Gukguk");
    }  
}
class Kambing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Mbekk");
    }
}
//Main program
public class Polymorphism {
    public static void main(String args[ ]) {
        //Membuatembuat objek baru dengan nama a, b, dan c
        Hewan a = new Anjing();
        Hewan b = new Kucing();
        Hewan c = new Kambing();
        //Mengakses method suara dari masing-masing object
        a.suara();
        b.suara();
        c.suara();
    }  
}   
