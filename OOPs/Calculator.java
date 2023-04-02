import java.util.*;
public class Calculator {
    int a,b,res;
    int oper;
    void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for addition \nPress 2 for subtraction \nPress 3 for Multiplication \nPress 4 for Division \nPress 5 for Modulus Division");
        oper = sc.nextInt();
        System.out.println("Enter value of a");
        System.out.println("Enter value of b");
        a = sc.nextInt();
        b = sc.nextInt();
        
        switch(oper){
            case 1 : res = a+b;
            System.out.println(res);
            break;
            case 2 : res = b-a;
            System.out.println(res);
            break;
            case 3 : res = a*b;
            System.out.println(res);
            break;
            case 4 : res = a/b;
            System.out.println(res);
            break;
            case 5 : res = a%b;
            System.out.println(res);
            default:
            System.out.println("Invalid operation");
        }
        sc.close();
    }
    public static void main(String[] args){
        Calculator ob = new Calculator();
        ob.calculate();
    }



}
    
