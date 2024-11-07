public class Abstraction {
    public static void main(String args[]){
        Horse h = new Horse();
        Mustang mus = new Mustang();
        h.eat();
        h.walk();
        System.out.println(h.skinColor);


        // Chicken chick = new Chicken();
        // chick.eat();
        // chick.walk();

        // Animal an = new Animal(); // red line becoz abstract funct can't implement..

    }
}

abstract class Animal{
    String skinColor;
    Animal(){
        skinColor = "brown";
        System.out.println("animal contructor is being called");
    }
    
    void eat(){                             //not abstract methods..
        System.out.println("animal eats");
    }

    abstract void walk();    // abstract method  // walk funct should be used only in subclasses
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is being called");
    }
    void changeColor(){
        skinColor = "dark brown" ;
    }
    
    
    
    void walk(){
        System.out.println("walks on 4 leg");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is being called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
