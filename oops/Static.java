public class Static {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "losma";
        s1.schoolName = "silverOak";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        s2.schoolName = "ABC";
        System.out.println(s1.schoolName);

    }  
}

class Student{
    String name;
    int rollNum;

    static String schoolName;

    void setNames(String name){
        this.name = name;
    }
    String getNames(){
        return this.name;
    }
}
