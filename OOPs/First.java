import java.util.*;
class First{
    int a,b;
    public void division(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        a = sc.nextInt();
        System.out.print("Enter 2nd number ");
        b = sc.nextInt();
        int div = a/b;
        System.out.println("Division of numbers is: "+div);
        sc.close();
    }
    public static void main(String[] args){
        First ob = new First();
        ob.division();
    }
}