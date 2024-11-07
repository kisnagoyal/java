public class Polymorphism {
    public static void main(String args[]){
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(12,13));
        // System.out.println(calc.sum((float)12.9, (float)0.1));
        // System.out.println(calc.sum(9,1,10));
//--------------------------------------------------------

        Animal an = new Animal();
        an.eat();
        //also
        Deer de = new Deer();
        de.eat();
    }

}

//METHOD OVERLOADING or FUNCTION OVERLOADING----Compile Time Polymorphism
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    void eat(){
        System.out.println("EAT ANYTHING");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}
