public class Outer {
	    public class Inner {
        public void printMessage() {
            System.out.println("This is a non-static nested class.");
        }
    }
    public static void main(String[] args) {
        // Outer Obj = new Outer();
        Outer.Inner nestedObject = nestedObject.new Outer.Inner();
        nestedObject.printMessage();
    }
}