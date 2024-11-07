public class constructor {
    public static void main(String args[]){
        Student s1 = new Student("HEY BUDDY");
        s1.password = "ABCD";
        s1.marks[0] = 2;
        s1.marks[1] = 4;
        s1.marks[2] = 6;

        Student s2 = new Student(s1);            //copying items of s1 in s3
        // System.out.println(s2.password);
        s2.password = "xyz";
        s1.marks[0] = 5; //

        // System.out.println(s2.password);
        for(int i = 0; i < s1.marks.length;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
    class Student{
        String name;
        int rollNum;
        String password;
        int marks[];
        Student(String name){
            marks = new int[3];
            System.out.println("hello world!");                         // parameterized constructor
            this.name = name;
        }
        Student(){
            marks = new int[3];
            System.out.println("constructor is ready");                   // non parameterized constructor
        }

        //shallow copy constructor...
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.rollNum = s1.rollNum;
            this.marks = s1.marks;
        }

        // deep copy contructor...
        // Student(Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.rollNum = s1.rollNum;
        //     for(int i = 0; i < marks.length;i++){
        //         this.marks[i] = s1.marks[i];
        //     }
        // }
    }

