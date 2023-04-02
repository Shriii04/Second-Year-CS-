import java.util.Scanner;
public class Ascii {
    char a;
    public void ascii(){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a character to print its ascii value: ");
        // a = sc.next().charAt(0);
        // System.out.println("The Ascii value is "+(int)a);
        System.out.println("Create password");
        String S = sc.nextLine();
        System.out.println("Enter password");
        String S1 = sc.nextLine();
        if(S.equals(S1)){
            System.out.println("Correct password");
        }
        else{
            System.out.println("Incorrect password");
        }
        sc.close();
    }
    public static void main(String[] args) {
        Ascii ob = new Ascii();
        ob.ascii();
    }
   
}
