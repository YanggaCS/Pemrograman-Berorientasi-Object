class Hewan {
    public void suara() {
        System.out.println("....");
    }
}
class Kucing extends Hewan {
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

class bunyi {
    public static void main(String args[ ]) {
        Hewan a = new Anjing();
        Hewan b = new Kucing();
        Hewan c = new Kambing();
        
        a.suara();
        b.suara();
        c.suara();
    }
}