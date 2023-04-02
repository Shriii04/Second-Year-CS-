// import java.util.*;

// class Shape{
//     void setArea(float r){
//         System.out.println("Area of Circle = "+ 3.14*r*r);
//     }
//     void setArea(double s){
//         System.out.println("Area of Square = "+ s*s);
//     }
    
// }
// class Circle extends Shape {
//     Scanner sc = new Scanner(System.in);
//     float getInputs(){
//         System.out.print("Enter radius of Circle: ");
//         float r = sc.nextInt();
//         return r;
//     }
// }
// class Square extends Shape {
//     Scanner sc = new Scanner(System.in);
//     double getInputs(){
//         System.out.print("Enter side of square: ");
//         double s = sc.nextInt();
//         return s;
//     }
// }


// public class Area{
//     public static void main(String[] args) {
//         Circle ob1 = new Circle();
//         float r1 = ob1.getInputs();
//         ob1.setArea(r1);
//         Square ob2 = new Square();
//         double s1 = ob2.getInputs();
//         ob2.setArea(s1);
//     }
// }
import java.util.Scanner;

class Shape {

    float setArea(float b, float h) {
        System.out.println("The area of triangle is:" + 0.5f * b * h);
        return (0.5f * b * h);
    }

    double setArea(double r) {
        System.out.println("The area of circle is:" + 3.14 * r * r);
        return 3.14 * r * r;
    }

    float setArea(float S) {
        System.out.println("The area of square is:" + S * S);
        return S * S;
    }

}

class Triangle extends Shape {

    float getinputs() {
        System.out.println("Enter the height of triangle:");
        Scanner sc = new Scanner(System.in);
        float h = sc.nextFloat();
        
        System.out.println("Enter the breadth of triangle:");
        float b = sc.nextFloat();
        

        return setArea(b, h);

    }
}

class Square extends Shape {
    float getinputs() {
        System.out.println("Enter the side of square:");
        Scanner sc = new Scanner(System.in);
        float S = sc.nextFloat();
        return setArea(S);

    }
}

class Circle extends Shape {
    double getinputs() {
        System.out.println("Enter the radius of circle:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        return setArea(r);
        // scanner.close();
        
    }
    

}

public class Area {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.getinputs();

        Square s1 = new Square();
        s1.getinputs();
        Triangle t1 = new Triangle();
        t1.getinputs();

    }
}
