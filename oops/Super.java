public class Super {
    public static void main(String args[]){
        Horse h = new Horse();
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is made");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("Horse constructor is made");
    }
}