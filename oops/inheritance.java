public class inheritance {
    public static void main(String args[]){
        // Dog tommy = new Dog();
        // tommy.breedType();
        // tommy.eat();
        // tommy.legs = 4;
        // System.out.println(tommy.legs);
// ----------------------------------------------------------------------------------------------------------------------------------------------------
        Forest tiger = new Forest();
        tiger.hunt();
        tiger.dangerous();
        tiger.eat();

        Terestial cat = new Terestial();
        cat.walk();
        cat.cute();
        cat.eat();
    } 
}

//BASE CLASS...
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

// Hybrid inheritance///

class Pet extends Animal{
    void cute(){
        System.out.println("CUTE");
    }
}
class Wild extends Animal{
    void dangerous(){
        System.out.println("DANGEROUS");
    }
}

class Aquatic extends Pet{
    void swim(){
        System.out.println("CAN SWIM");
    }
}

class Terestial extends Pet{
    void walk(){
        System.out.println("can walk");
    }
}

class Forest extends Wild{
    void hunt(){
        System.out.println("HUNTING");
    }
}

class Mountain extends Wild{
    void climb(){
        System.out.println("can climb");
    }
}


// Hierarchial inheritance..

class Bird extends Animal{
    void fly(){
        System.out.println("FLYING");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("SWIMMING");
    }
}

class Land extends Animal{
    void walk(){
        System.out.println("WALKING ");
    }
}





// multi inheritance..
class Mammal extends Animal{
    int legs =4;
    String adaptation;
}

class Dog extends Mammal{
    int breed;
    void breedType(){
        System.out.println("BREED");
    }
}


// //DERIVED CLASS / SUB CLASS...       example of single inheritance
// class Fish extends Animal{
//      int fin;
//      void swim(){
//         System.out.println("Fish is swimming");
//      }
// }


