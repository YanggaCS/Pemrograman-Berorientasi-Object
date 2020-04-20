import java.util.*;

 // Compiler version JDK 11.0.2
 
 class Animal {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meong");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Guk");
    }
}

class Dcoder {
    public static void main(String args[ ]) {
        Animal a = new Dog();
        Animal b = new Cat();
        
        a.makeSound();
        b.makeSound();
    }
}
