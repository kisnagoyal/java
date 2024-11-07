class Student {
  int rollno;
  String name;
  static String college = "ABC"; 		//static data member
}
public class Test {
  public static void main(String[] args) {
    Student s1 = new Student(); 		//create an object of Student class
    s1.rollno = 101;
    s1.name = "Alice";
    System.out.println(s1.rollno + " " + s1.name + " " + s1.college); //access static data member by object
    System.out.println(Student.college); //access static data member by class name
  }
}
