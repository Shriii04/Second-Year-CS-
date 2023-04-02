import java.util.*;
public class Stipend {
    Scanner sc = new Scanner(System.in);
    int marks;
    final int stipend = 100;

    public int calculateStipend(){
        System.out.println("Enter Marks: ");
        marks = sc.nextInt();

        if(marks >= 85 && marks < 90) {
            return stipend +10;
            }
        else if(marks >= 90 && marks < 95) {
            return stipend +15;
            }
        else if(marks >= 95 && marks < 100) {
            return stipend +20;
            }
        else{
         return stipend ;
        }        
    }

    public static void main(String[] args) {
        Stipend ob = new Stipend();
        System.out.println(ob.calculateStipend());
        
    }

    
}
