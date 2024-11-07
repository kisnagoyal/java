public class Interface2 {
    public static void main(String args[]){
        Bear B = new Bear();
        B.eats();
        B.shortTeeth();
    }
}

interface Carnivore{
    void eats();
    // {
    //     System.out.println("eats meat");
    // }
}

interface Herbivore{
    void longTeeth();
    // {
    //     System.out.println("eats grass");
    // }
}

class Bear implements Carnivore, Herbivore{
    public void eats(){
        System.out.println("can eats grass and meat");
    }
    public void longTeeth(){
        System.out.println("long teeth");
    }
    public void shortTeeth(){
        System.out.println("short teeth");
    }
}
