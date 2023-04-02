// import java.util.Scanner;
// class ExceptionHandling{
//     int a = 0,n=0,b=0,ans;
//     public void exc(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number  ");
//         n = sc.nextInt();
//         System.out.println("Enter Second Number");
//         b = sc.nextInt();
//         try{
//             if(b==0)
//             a = n/b;
//         }
//         catch(ArithmeticException e){
//             //System.out.println(e);
//             System.out.println("You shouldn't divide a number by zero");
//         }  
//         if(b!=0){
//             ans = n/b;
//             System.out.println("Answer = "+ans);
//         } 
//         sc.close();

// }
//     public static void main(String[] args) {
//         ExceptionHandling ob = new ExceptionHandling();
//         ob.exc();
//     }
// }
import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Exception You Want to Try");
        System.out.println("1:Divide by Zero \n2:Array Index Out of Bounds \n3:Null Pointer Exception");
        int i = sc.nextInt();
        int a[]=new int[]{1,2,3,4,5};
        int b,c,d;
        String s=null;
        switch (i) {
            case 1:
                System.out.println("Divide by Zero Exception");
                try {
                    System.out.println("Enter Two numbers");
                    b=sc.nextInt();
                    c=sc.nextInt();
                    d=b/c;
                    System.out.println(d);
                }
                catch(ArithmeticException ae){
                    System.out.println("You shouldn't divide a number by zero");
                }
                break;
            case 2:
                System.out.println("Array Index Out of Bounds Exception");
                try{
                    System.out.println(a[2]);
                    System.out.println(a[10]);
                }
                catch (ArrayIndexOutOfBoundsException aiobe){
                    System.out.println("OOPs!!!"+aiobe.getMessage());
                }
                break;
            case 3:
                System.out.println("Null Pointer Exception");
                try {
                    System.out.println("Value in String is "+s);
                    System.out.println(s.length());
                }
                catch(NullPointerException npe){
                    System.out.println("Null Pointer Exception Arises");
                }
                break;
        }
        sc.close();
    }
    
}

