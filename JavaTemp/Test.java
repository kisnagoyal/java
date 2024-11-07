import java.util.Scanner;
import java.util.*;

class InvalidTriangleException extends Exception{
    double invalidDimension;
    InvalidTriangleException(double InvalidTriangleException){
        this.invalidDimension = invalidDimension;
    }
}
class Triangle{
    double side1;
    double side2;
    double side3;

    Triangle(double side1,double side2, double side3) throws InvalidTriangleException{
        double s12 = side1+side2;
        double s23 = side2 + side3;
        double s31 = side3 + side1;
        if(side1 >0 && side2>0 &&side3 >0 && (s12 > side3) && (s23 > side1) && (s31 > side2) ){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        }
        else{
            throw new InvalidTriangleException(100000);
        }  
        System.out.println("completed");
    }
}

public class Test {

    public static void main(String[] args) throws InvalidTriangleException {
       Triangle t = new Triangle(0,10,100);
    }
}
