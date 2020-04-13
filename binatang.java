public class Binatang {
    void kucing() {
        System.out.println("Meow");
    }
    void kambing() {
        System.out.println("Mbeek");
    }
}

class Akses {
    public static void main(String[] args) {
        Binatang hewan = new Binatang();
        hewan.kucing();
        hewan.kambing();
    }
}