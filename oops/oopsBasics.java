public class oopsBasics {
    public static void main(String args[]){
        // pen p1 = new pen();
        // p1.SetColor("Yellow");
        // System.out.println(p1.color);
        // p1.settip(5);
        // System.out.println(p1.tip);
        // p1.color = "Red";
        // p1.tip= 10;
        // System.out.println(p1.color);
        // System.out.println(p1.tip);
//--------------------------------------------------------------------------------------------------------------------------------
        student kisna = new student(); // here we maek object kisna
        kisna.StudentPercent(50, 50, 50);
        System.out.println(kisna.percentage);
    }
}

class pen{
    String color;
    int tip;
    void settip(int newTip){
        tip = newTip;
    }
    void SetColor(String newcolor){
        color = newcolor;
    }
}

class student{
    String name;
    int marks;
    int rollNum;
    float percentage;
    void StudentPercent(int phy, int chem,int maths){
        percentage = ((phy + chem + maths)*100)/300;
    }
}
