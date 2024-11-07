public class oopsBasics2{
    public static void main(String args[]){
        Pen p1 = new Pen();
        
        p1.SetColor("Yellow");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.SetColor("RED"); 
        p1.settip(10);
        System.out.println(p1.getcolor());
        System.out.println(p1.gettip());
    }
}

class Pen{
    private String color;
    private int tip;
    String getcolor(){        // getter
        return this.color;
    }
    int gettip(){
        return this.tip;
    }
    void settip(int newTip){    //setters
        this.tip = newTip;
    }
    void SetColor(String color){  //setters....here color argument refers to the new color
        this.color = color;   // this color means original color
    }
}