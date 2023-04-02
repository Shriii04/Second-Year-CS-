import java.util.*;
public class sumofdigit {
    public void summ(){
        int a,b;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        while(a!=0){
            b = a%10;
            sum = sum+b;
            a = a/10;
        }
        System.out.println("Sum of Digit is :"+sum);
        sc.close();

    }    
public static void main(String[] args) {
    sumofdigit ob = new sumofdigit();
    ob.summ();
}
}
